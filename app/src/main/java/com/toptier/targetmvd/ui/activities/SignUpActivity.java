package com.toptier.targetmvd.ui.activities;

import android.os.Bundle;
import android.view.MenuItem;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.R;
import com.toptier.targetmvd.ui.models.SignUpModel;
import com.toptier.targetmvd.ui.presenters.SignUpPresenter;
import com.toptier.targetmvd.ui.providers.BusProvider;
import com.toptier.targetmvd.ui.views.SignUpView;

public class SignUpActivity extends BaseActivity {
    private SignUpPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Bus bus = BusProvider.getInstance();
        mPresenter = new SignUpPresenter(
                new SignUpView(this, bus),
                new SignUpModel(bus));
    }

    @Override
    protected void onResume() {
        super.onResume();
        register(mPresenter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregister(mPresenter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mPresenter.finishActivity(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
