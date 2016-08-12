package com.toptier.targetmvd.ui.views;

import com.squareup.otto.Bus;
import com.toptier.targetmvd.R;
import com.toptier.targetmvd.ui.activities.SignInActivity;

public class SignInView extends BaseView {
    private Bus mBus;

    public SignInView(SignInActivity activity, Bus bus) {
        super(activity);
        this.mBus = bus;

        setActionBar(getActivity(), getActivity().getString(R.string.sign_in));
    }
}
