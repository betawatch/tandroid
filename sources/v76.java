// default package

import android.provider.Settings;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v76 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x76 b;

    public /* synthetic */ v76(x76 x76Var, byte b) {
        this.a = b;
        this.b = x76Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xa8 xa8Var;
        LaunchActivity launchActivity;
        byte b = this.a;
        x76 x76Var = this.b;
        switch (b) {
            case 0:
                xa8 xa8Var2 = x76Var.a;
                if (xa8Var2 != null) {
                    xa8Var2.c();
                    break;
                }
                break;
            default:
                m8b m8bVar = x76Var.c;
                if (m8bVar != null && x76Var.G0() && (xa8Var = x76Var.a) != null && xa8Var.c == 0 && (launchActivity = LaunchActivity.H1) != null && Settings.canDrawOverlays(launchActivity)) {
                    m8bVar.S();
                    break;
                }
                break;
        }
    }
}
