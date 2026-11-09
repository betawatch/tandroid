package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e40 b;

    public /* synthetic */ u00(e40 e40Var, int i7) {
        this.a = i7;
        this.b = e40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        e40 e40Var = this.b;
        switch (i7) {
            case 0:
                if (e40Var.u1()) {
                    LaunchActivity launchActivity = e40Var.Z1;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.g1.i()) {
                        org.telegram.ui.Components.voip.g1.k(e40Var.Z1);
                        break;
                    }
                }
                if (!e40Var.u1()) {
                    LaunchActivity launchActivity2 = e40Var.Z1;
                    Typeface typeface2 = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.q10.f0 = false;
                        break;
                    }
                }
                break;
            case 1:
                if (e40Var.R2 != null && e40Var.I3 && VoIPService.getSharedInstance() != null) {
                    try {
                        e40Var.s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    e40Var.P1(1, true);
                    org.telegram.messenger.g0.i3(e40Var.o4, 80L);
                    e40Var.I3 = false;
                    e40Var.J3 = true;
                    break;
                }
                break;
            case 2:
                int i10 = e40Var.K3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    e40Var.T1(true, false);
                    break;
                }
            case 3:
                e40Var.A1();
                break;
            case 4:
                e40Var.a1();
                e40Var.X0();
                e40Var.W0();
                e40Var.w1.setTranslationY((-e40Var.t3.d()) + e40Var.b.getPaddingBottom());
                e40Var.x1.invalidate();
                e40Var.b1();
                e40Var.b.invalidate();
                break;
            case 5:
                e40Var.dismiss();
                break;
            case 6:
                e40Var.Q1();
                org.telegram.messenger.g0.i3(e40Var.u3, 1000L);
                break;
            case 7:
                a30 a30Var = e40Var.i2;
                if (a30Var != null) {
                    a30Var.show();
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.qp.s1(e40Var.k1.a).l0(null);
                break;
            default:
                e40Var.o5 = null;
                e40Var.N1(true);
                break;
        }
    }
}
