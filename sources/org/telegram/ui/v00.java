package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ v00(f40 f40Var, int i7) {
        this.a = i7;
        this.b = f40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        f40 f40Var = this.b;
        switch (i7) {
            case 0:
                if (f40Var.u1()) {
                    LaunchActivity launchActivity = f40Var.c2;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.g1.i()) {
                        org.telegram.ui.Components.voip.g1.k(f40Var.c2);
                        break;
                    }
                }
                if (!f40Var.u1()) {
                    LaunchActivity launchActivity2 = f40Var.c2;
                    Typeface typeface2 = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.p10.f0 = false;
                        break;
                    }
                }
                break;
            case 1:
                if (f40Var.U2 != null && f40Var.L3 && VoIPService.getSharedInstance() != null) {
                    try {
                        f40Var.v1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    f40Var.P1(1, true);
                    org.telegram.messenger.g0.i3(f40Var.r4, 80L);
                    f40Var.L3 = false;
                    f40Var.M3 = true;
                    break;
                }
                break;
            case 2:
                int i10 = f40Var.N3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    f40Var.T1(true, false);
                    break;
                }
            case 3:
                f40Var.A1();
                break;
            case 4:
                f40Var.a1();
                f40Var.X0();
                f40Var.W0();
                f40Var.z1.setTranslationY((-f40Var.w3.d()) + f40Var.b.getPaddingBottom());
                f40Var.A1.invalidate();
                f40Var.b1();
                f40Var.b.invalidate();
                break;
            case 5:
                f40Var.dismiss();
                break;
            case 6:
                f40Var.Q1();
                org.telegram.messenger.g0.i3(f40Var.x3, 1000L);
                break;
            case 7:
                b30 b30Var = f40Var.l2;
                if (b30Var != null) {
                    b30Var.show();
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.qp.s1(f40Var.n1.a).l0(null);
                break;
            default:
                f40Var.r5 = null;
                f40Var.N1(true);
                break;
        }
    }
}
