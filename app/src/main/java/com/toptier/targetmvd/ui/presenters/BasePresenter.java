package com.toptier.targetmvd.ui.presenters;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;

public class BasePresenter {

    public void startActivity(Activity activity, Intent intent, Pair<View, String>... pairs) {
        // Check if the transition needs to be done according to the Android version of the device,
        // and if there is any transition to be made.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && pairs.length > 0) {
            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pairs);
            activity.startActivity(intent, options.toBundle());
        } else {
            activity.startActivity(intent);
        }
    }

    public void finishActivity(Activity activity) {
        // Check if the transition needs to be done according to the Android version of the device.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }
}
