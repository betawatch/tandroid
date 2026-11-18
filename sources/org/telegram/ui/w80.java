package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w80 implements OnBackInvokedCallback {
    public final /* synthetic */ LaunchActivity a;

    public w80(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.g0.Q1()) {
            this.a.onBackPressed();
            return;
        }
        if (this.a.d0(true)) {
            LaunchActivity launchActivity = this.a;
            ActionBarLayout actionBarLayout = launchActivity.p0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.j1) {
                actionBarLayout.I();
            } else {
                actionBarLayout.j1 = false;
                actionBarLayout.e(false);
            }
        }
    }
}
