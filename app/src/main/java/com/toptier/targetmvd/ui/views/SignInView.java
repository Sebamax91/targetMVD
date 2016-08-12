package com.toptier.targetmvd.ui.views;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.R;
import com.toptier.targetmvd.ui.activities.SignInActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignInView extends BaseView {
    private Bus mBus;

    public SignInView(SignInActivity activity, Bus bus) {
        super(activity);
        this.mBus = bus;

        ButterKnife.bind(this, activity);

        setActionBar(getActivity(), getActivity().getString(R.string.sign_in));
    }

    @OnClick(R.id.sign_up)
    public void signUpnOnClick() {
        mBus.post(new MainView.SignUpOnClickEvent());
    }
}
