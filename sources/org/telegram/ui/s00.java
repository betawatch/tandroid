package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c40 b;

    public /* synthetic */ s00(c40 c40Var, int i7) {
        this.a = i7;
        this.b = c40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        c40 c40Var = this.b;
        switch (i7) {
            case 0:
                if (c40Var.u1()) {
                    LaunchActivity launchActivity = c40Var.Z1;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.g1.i()) {
                        org.telegram.ui.Components.voip.g1.k(c40Var.Z1);
                        break;
                    }
                }
                if (!c40Var.u1()) {
                    LaunchActivity launchActivity2 = c40Var.Z1;
                    Typeface typeface2 = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.p10.f0 = false;
                        break;
                    }
                }
                break;
            case 1:
                if (c40Var.R2 != null && c40Var.I3 && VoIPService.getSharedInstance() != null) {
                    try {
                        c40Var.s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    c40Var.P1(1, true);
                    org.telegram.messenger.g0.i3(c40Var.o4, 80L);
                    c40Var.I3 = false;
                    c40Var.J3 = true;
                    break;
                }
                break;
            case 2:
                int i10 = c40Var.K3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    c40Var.T1(true, false);
                    break;
                }
            case 3:
                c40Var.A1();
                break;
            case 4:
                c40Var.a1();
                c40Var.X0();
                c40Var.W0();
                c40Var.w1.setTranslationY((-c40Var.t3.d()) + c40Var.b.getPaddingBottom());
                c40Var.x1.invalidate();
                c40Var.b1();
                c40Var.b.invalidate();
                break;
            case 5:
                c40Var.dismiss();
                break;
            case 6:
                c40Var.Q1();
                org.telegram.messenger.g0.i3(c40Var.u3, 1000L);
                break;
            case 7:
                y20 y20Var = c40Var.i2;
                if (y20Var != null) {
                    y20Var.show();
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.qp.s1(c40Var.k1.a).l0(null);
                break;
            default:
                c40Var.o5 = null;
                c40Var.N1(true);
                break;
        }
    }
}
