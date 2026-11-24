// default package

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w35 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h75 b;

    public /* synthetic */ w35(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        h75 h75Var = this.b;
        switch (b) {
            case 0:
                if (!h75Var.i1()) {
                    LaunchActivity launchActivity = h75Var.b2;
                    Typeface typeface = gl.a;
                    if (Settings.canDrawOverlays(launchActivity)) {
                        o85.g0 = false;
                        break;
                    }
                }
                break;
            case 1:
                h75Var.O0();
                break;
            case 2:
                if (h75Var.T2 != null && h75Var.K3 && VoIPService.getSharedInstance() != null) {
                    try {
                        h75Var.v1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    h75Var.H1(1, true);
                    gl.e3(h75Var.p4, 80L);
                    h75Var.K3 = false;
                    h75Var.L3 = true;
                    break;
                }
                break;
            case 3:
                int i = h75Var.M3;
                if (i == 1 || i == 2 || i == 6 || i == 5) {
                    h75Var.L1(true, false);
                    break;
                }
            case 4:
                h75Var.O0();
                h75Var.L0();
                h75Var.K0();
                h75Var.y1.setTranslationY((-h75Var.w3.d()) + h75Var.b.getPaddingBottom());
                h75Var.z1.invalidate();
                h75Var.P0();
                h75Var.b.invalidate();
                break;
            case 5:
                h75Var.p1();
                break;
            case 6:
                h75Var.dismiss();
                break;
            case 7:
                h75Var.I1();
                gl.e3(h75Var.x3, 1000L);
                break;
            case 8:
                j65 j65Var = h75Var.k2;
                if (j65Var != null) {
                    j65Var.show();
                    break;
                }
                break;
            case 9:
                na7.q1(h75Var.n1.a).h0(null);
                break;
            default:
                h75Var.m5 = null;
                h75Var.D1(true);
                break;
        }
    }
}
