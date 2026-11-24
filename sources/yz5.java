// default package

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yz5 implements OnBackInvokedCallback {
    public final /* synthetic */ LaunchActivity a;

    public yz5(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void onBackInvoked() {
        boolean O1 = gl.O1();
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
