package com.toptier.targetmvd.ui.views;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.R;
import com.toptier.targetmvd.ui.activities.MainActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainView extends BaseView {
    private MainActivity mActivity;
    private Bus mBus;

    @Bind(R.id.sign_up)         Button signUpButton;
    @Bind(R.id.sign_in)         Button signInButton;
    @Bind(R.id.spinner_gender)  Spinner genderSpinner;

    public MainView(MainActivity activity, Bus bus) {
        super(activity);
        this.mBus = bus;

        ButterKnife.bind(this, activity);

        initializeSpinner(activity);
    }

    @OnClick(R.id.sign_in)
    public void signInOnClick() {
        mBus.post(new SignInOnClickEvent());
    }

    @OnClick(R.id.sign_up)
    public void signUpOnClick() {
        mBus.post(new SignUpOnClickEvent());
    }

    private void initializeSpinner(MainActivity activity) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(activity,
                R.array.genders_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        genderSpinner.setAdapter(adapter);
    }

    public static class SignUpOnClickEvent {}
    public static class SignInOnClickEvent {}
}
