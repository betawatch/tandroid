package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z90 implements OnBackInvokedCallback {
    public final /* synthetic */ LaunchActivity a;

    public z90(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void onBackInvoked() {
        if (org.telegram.messenger.i0.Q1()) {
            this.a.onBackPressed();
            return;
        }
        if (this.a.d0(true)) {
            LaunchActivity launchActivity = this.a;
            ActionBarLayout actionBarLayout = launchActivity.q0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.i1) {
                actionBarLayout.H();
            } else {
                actionBarLayout.i1 = false;
                actionBarLayout.e(false);
            }
        }
    }
}
