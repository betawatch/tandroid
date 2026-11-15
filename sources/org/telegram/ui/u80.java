package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u80 implements OnBackInvokedCallback {
    public final /* synthetic */ LaunchActivity a;

    public u80(LaunchActivity launchActivity) {
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
