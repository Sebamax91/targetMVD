package com.toptier.targetmvd.ui.views;

import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.R;
import com.toptier.targetmvd.ui.activities.SignUpActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignUpView extends BaseView {
    private Bus mBus;

    @Bind(R.id.spinner_gender) Spinner genderSpinner;

    public SignUpView(SignUpActivity activity, Bus bus) {
        super(activity);
        this.mBus = bus;

        ButterKnife.bind(this, activity);

        setActionBar(getActivity(), getActivity().getString(R.string.sign_up));

        initializeSpinner();
    }

    @OnClick(R.id.sign_in)
    public void signInOnClick() {
        mBus.post(new MainView.SignInOnClickEvent());
    }

    private void initializeSpinner() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.genders_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        genderSpinner.setAdapter(adapter);
    }
}
