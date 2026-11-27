// default package

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z55 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j95 b;

    public /* synthetic */ z55(j95 j95Var, byte b) {
        this.a = b;
        this.b = j95Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j95 j95Var = this.b;
        switch (b) {
            case 0:
                if (!j95Var.j1()) {
                    LaunchActivity launchActivity = j95Var.b2;
                    Typeface typeface = hl.a;
                    if (Settings.canDrawOverlays(launchActivity)) {
                        ra5.g0 = false;
                        break;
                    }
                }
                break;
            case 1:
                j95Var.P0();
                break;
            case 2:
                if (j95Var.T2 != null && j95Var.K3 && VoIPService.getSharedInstance() != null) {
                    try {
                        j95Var.v1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    j95Var.I1(1, true);
                    hl.d3(j95Var.p4, 80L);
                    j95Var.K3 = false;
                    j95Var.L3 = true;
                    break;
                }
                break;
            case 3:
                int i = j95Var.M3;
                if (i == 1 || i == 2 || i == 6 || i == 5) {
                    j95Var.M1(true, false);
                    break;
                }
            case 4:
                j95Var.P0();
                j95Var.M0();
                j95Var.L0();
                j95Var.y1.setTranslationY((-j95Var.w3.d()) + j95Var.b.getPaddingBottom());
                j95Var.z1.invalidate();
                j95Var.Q0();
                j95Var.b.invalidate();
                break;
            case 5:
                j95Var.dismiss();
                break;
            case 6:
                j95Var.J1();
                hl.d3(j95Var.x3, 1000L);
                break;
            case 7:
                l85 l85Var = j95Var.k2;
                if (l85Var != null) {
                    l85Var.show();
                    break;
                }
                break;
            case 8:
                j95Var.m5 = null;
                j95Var.E1(true);
                break;
            case 9:
                j95Var.q1();
                break;
            default:
                uc7.s1(j95Var.n1.a).j0(null);
                break;
        }
    }
}
