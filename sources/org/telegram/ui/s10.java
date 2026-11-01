package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a50 b;

    public /* synthetic */ s10(a50 a50Var, int i10) {
        this.a = i10;
        this.b = a50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a50 a50Var = this.b;
        switch (i10) {
            case 0:
                if (a50Var.t1()) {
                    LaunchActivity launchActivity = a50Var.Z1;
                    Typeface typeface = org.telegram.messenger.i0.a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.t0.d0.V) {
                        a50Var.dismiss();
                        org.telegram.messenger.i0.h3(new s10(a50Var, 4), 100L);
                        break;
                    }
                }
                break;
            case 1:
                if (a50Var.R2 != null && a50Var.I3 && VoIPService.getSharedInstance() != null) {
                    try {
                        a50Var.s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    a50Var.M1(1, true);
                    org.telegram.messenger.i0.h3(a50Var.o4, 80L);
                    a50Var.I3 = false;
                    a50Var.J3 = true;
                    break;
                }
                break;
            case 2:
                int i11 = a50Var.K3;
                if (i11 == 1 || i11 == 2 || i11 == 6 || i11 == 5) {
                    a50Var.Q1(true, false);
                    break;
                }
            case 3:
                a50Var.x1();
                break;
            case 4:
                org.telegram.ui.Components.voip.t0.h(a50Var.Z1);
                break;
            case 5:
                a50Var.dismiss();
                break;
            case 6:
                a50Var.N1();
                org.telegram.messenger.i0.h3(a50Var.u3, 1000L);
                break;
            case 7:
                w30 w30Var = a50Var.i2;
                if (w30Var != null) {
                    w30Var.show();
                    break;
                }
                break;
            case 8:
                a50Var.a1();
                a50Var.X0();
                a50Var.W0();
                a50Var.w1.setTranslationY((-a50Var.t3.d()) + a50Var.b.getPaddingBottom());
                a50Var.x1.invalidate();
                a50Var.b1();
                a50Var.b.invalidate();
                break;
            case 9:
                org.telegram.messenger.wp.r1(a50Var.k1.a).l0(null);
                break;
            default:
                a50Var.o5 = null;
                a50Var.K1(true);
                break;
        }
    }
}
