package org.telegram.ui;

import android.graphics.Typeface;
import android.provider.Settings;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                if (e40Var.v1()) {
                    LaunchActivity launchActivity = e40Var.d2;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity) && !org.telegram.ui.Components.voip.k1.e()) {
                        org.telegram.ui.Components.voip.k1.g(e40Var.d2);
                        break;
                    }
                }
                if (!e40Var.v1()) {
                    LaunchActivity launchActivity2 = e40Var.d2;
                    Typeface typeface2 = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(launchActivity2)) {
                        org.telegram.ui.Components.a20.g0 = false;
                        break;
                    }
                }
                break;
            case 1:
                e40Var.b1();
                break;
            case 2:
                if (e40Var.V2 != null && e40Var.Q3 && VoIPService.getSharedInstance() != null) {
                    try {
                        e40Var.w1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    e40Var.R1(1, true);
                    org.telegram.messenger.g0.h3(e40Var.w4, 80L);
                    e40Var.Q3 = false;
                    e40Var.R3 = true;
                    break;
                }
                break;
            case 3:
                int i10 = e40Var.S3;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    e40Var.V1(true, false);
                    break;
                }
            case 4:
                e40Var.b1();
                e40Var.Y0();
                e40Var.X0();
                e40Var.A1.setTranslationY((-e40Var.B3.d()) + e40Var.b.getPaddingBottom());
                e40Var.B1.invalidate();
                e40Var.c1();
                e40Var.b.invalidate();
                break;
            case 5:
                e40Var.B1();
                break;
            case 6:
                e40Var.dismiss();
                break;
            case 7:
                e40Var.S1();
                org.telegram.messenger.g0.h3(e40Var.C3, 1000L);
                break;
            case 8:
                a30 a30Var = e40Var.m2;
                if (a30Var != null) {
                    a30Var.show();
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.mp.u1(e40Var.o1.a).l0(null);
                break;
            default:
                e40Var.w5 = null;
                e40Var.O1(true);
                break;
        }
    }
}
