package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                if (f40Var.v1()) {
                    LaunchActivity launchActivity = f40Var.d2;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.j1.j()) {
                        org.telegram.ui.Components.voip.j1.k(f40Var.d2);
                        break;
                    }
                }
                if (!f40Var.v1()) {
                    LaunchActivity launchActivity2 = f40Var.d2;
                    Typeface typeface2 = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.c20.g0 = false;
                        break;
                    }
                }
                break;
            case 1:
                f40Var.b1();
                break;
            case 2:
                if (f40Var.V2 != null && f40Var.Q3 && VoIPService.getSharedInstance() != null) {
                    try {
                        f40Var.w1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    f40Var.S1(1, true);
                    org.telegram.messenger.g0.h3(f40Var.w4, 80L);
                    f40Var.Q3 = false;
                    f40Var.R3 = true;
                    break;
                }
                break;
            case 3:
                int i10 = f40Var.S3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    f40Var.W1(true, false);
                    break;
                }
            case 4:
                f40Var.b1();
                f40Var.Y0();
                f40Var.X0();
                f40Var.A1.setTranslationY((-f40Var.B3.d()) + f40Var.b.getPaddingBottom());
                f40Var.B1.invalidate();
                f40Var.c1();
                f40Var.b.invalidate();
                break;
            case 5:
                f40Var.B1();
                break;
            case 6:
                f40Var.dismiss();
                break;
            case 7:
                f40Var.T1();
                org.telegram.messenger.g0.h3(f40Var.C3, 1000L);
                break;
            case 8:
                b30 b30Var = f40Var.m2;
                if (b30Var != null) {
                    b30Var.show();
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.mp.u1(f40Var.o1.a).l0(null);
                break;
            default:
                f40Var.w5 = null;
                f40Var.O1(true);
                break;
        }
    }
}
