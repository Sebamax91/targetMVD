package com.toptier.targetmvd.ui.presenters;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.util.Pair;
import android.view.View;

import com.squareup.otto.Subscribe;
import com.toptier.targetmvd.R;
import com.toptier.targetmvd.ui.activities.SignInActivity;
import com.toptier.targetmvd.ui.models.MainModel;
import com.toptier.targetmvd.ui.views.MainView;

import butterknife.ButterKnife;

public class MainPresenter extends BasePresenter {
    private MainView mView;
    private MainModel mModel;

    public MainPresenter(MainView view, MainModel model) {
        this.mView = view;
        this.mModel = model;
    }

    @Subscribe
    public void signInOnClick(MainView.SignInOnClickEvent e) {
        Activity activity = mView.getActivity();

        if (activity == null) { return; }

        Intent intent = new Intent(activity, SignInActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        // Make pairs for transition.
        Pair<View, String> pairTitle = Pair.create(ButterKnife.findById(activity, R.id.title), activity.getString(R.string.transition_title));
        Pair<View, String> pairButton = Pair.create(ButterKnife.findById(activity, R.id.sign_in), activity.getString(R.string.transition_button_sign_in));
        Pair<View, String> pairImage = Pair.create(ButterKnife.findById(activity, R.id.image), activity.getString(R.string.transition_image));

        startActivity(activity, intent, pairTitle, pairButton, pairImage);
    }
}
