package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                    LaunchActivity launchActivity = c40Var.d2;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.k1.i()) {
                        org.telegram.ui.Components.voip.k1.k(c40Var.d2);
                        break;
                    }
                }
                if (!c40Var.u1()) {
                    LaunchActivity launchActivity2 = c40Var.d2;
                    Typeface typeface2 = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.s10.g0 = false;
                        break;
                    }
                }
                break;
            case 1:
                c40Var.a1();
                break;
            case 2:
                if (c40Var.V2 != null && c40Var.Q3 && VoIPService.getSharedInstance() != null) {
                    try {
                        c40Var.w1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    c40Var.R1(1, true);
                    org.telegram.messenger.g0.i3(c40Var.w4, 80L);
                    c40Var.Q3 = false;
                    c40Var.R3 = true;
                    break;
                }
                break;
            case 3:
                int i10 = c40Var.S3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    c40Var.V1(true, false);
                    break;
                }
            case 4:
                c40Var.a1();
                c40Var.X0();
                c40Var.W0();
                c40Var.A1.setTranslationY((-c40Var.B3.d()) + c40Var.b.getPaddingBottom());
                c40Var.B1.invalidate();
                c40Var.b1();
                c40Var.b.invalidate();
                break;
            case 5:
                c40Var.A1();
                break;
            case 6:
                c40Var.dismiss();
                break;
            case 7:
                c40Var.S1();
                org.telegram.messenger.g0.i3(c40Var.C3, 1000L);
                break;
            case 8:
                y20 y20Var = c40Var.m2;
                if (y20Var != null) {
                    y20Var.show();
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.np.s1(c40Var.o1.a).l0(null);
                break;
            default:
                c40Var.w5 = null;
                c40Var.N1(true);
                break;
        }
    }
}
