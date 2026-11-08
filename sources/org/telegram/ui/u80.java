package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
            ActionBarLayout actionBarLayout = launchActivity.o0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.i1) {
                actionBarLayout.I();
            } else {
                actionBarLayout.i1 = false;
                actionBarLayout.e(false);
            }
        }
    }
}
