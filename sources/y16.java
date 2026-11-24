// default package

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y16 implements OnBackInvokedCallback {
    public final /* synthetic */ LaunchActivity a;

    public y16(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void onBackInvoked() {
        boolean O1 = gm.O1();
        LaunchActivity launchActivity = this.a;
        if (O1) {
            launchActivity.onBackPressed();
            return;
        }
        if (launchActivity.d0(true)) {
            ActionBarLayout actionBarLayout = launchActivity.p0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.j1) {
                actionBarLayout.G();
            } else {
                actionBarLayout.j1 = false;
                actionBarLayout.d(false);
            }
        }
    }
}
