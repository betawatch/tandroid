package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class za1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mc1 b;

    public /* synthetic */ za1(mc1 mc1Var, int i10) {
        this.a = i10;
        this.b = mc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        mc1 mc1Var = this.b;
        switch (i10) {
            case 0:
                mc1Var.Z = false;
                int i11 = mc1Var.W;
                int i12 = mc1Var.X;
                org.telegram.ui.ActionBar.f6 f6Var = mc1Var.s;
                int i13 = mc1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        f6Var.c = i11;
                        org.telegram.ui.ActionBar.h6.o1(false, false);
                    } else if (i12 == 1) {
                        f6Var.d = i11;
                        org.telegram.ui.ActionBar.h6.o1(true, true);
                        mc1Var.u0.f1();
                        mc1Var.V.setHasChanges(mc1Var.T0(mc1Var.n));
                        mc1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        f6Var.j = i11;
                    } else if (i12 == 1) {
                        int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Od);
                        if (i11 != 0 || C0 == 0) {
                            f6Var.k = i11;
                        } else {
                            f6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int C02 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                        if (i11 != 0 || C02 == 0) {
                            f6Var.l = i11;
                        } else {
                            f6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int C03 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Qd);
                        if (i11 != 0 || C03 == 0) {
                            f6Var.m = i11;
                        } else {
                            f6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.h6.o1(true, false);
                    mc1Var.V.setHasChanges(mc1Var.T0(mc1Var.n));
                    mc1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        f6Var.e = i11;
                    } else if (i12 == 1) {
                        f6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = f6Var.g;
                        f6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            mc1Var.v0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            mc1Var.v0.o(0);
                            mc1Var.e1();
                        }
                    } else {
                        f6Var.h = i11;
                    }
                    int i15 = mc1Var.X;
                    if (i15 >= 0) {
                        mc1Var.K0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.h6.o1(true, true);
                    mc1Var.u0.f1();
                    mc1Var.V.setHasChanges(mc1Var.T0(mc1Var.n));
                    mc1Var.m1(true);
                }
                int size = mc1Var.i0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) mc1Var.i0.get(i16);
                    j6Var.e(mc1Var.getThemedColor(j6Var.f), false, false);
                }
                mc1Var.n0.f1();
                mc1Var.u0.f1();
                ei.g6 g6Var = mc1Var.a0;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                mc1Var.X = -1;
                break;
            case 1:
                mc1Var.presentFragment(r91.d0(mc1Var.getMessagesController().getChat(Long.valueOf(-mc1Var.J1)), true));
                break;
            case 2:
                mc1Var.p1.c1(false);
                boolean a2 = mc1Var.a.a();
                org.telegram.ui.Components.uj0 uj0Var = mc1Var.N1;
                uj0Var.P(a2 ? uj0Var.e[0] : 0);
                org.telegram.ui.Components.uj0 uj0Var2 = mc1Var.N1;
                if (uj0Var2 != null) {
                    uj0Var2.start();
                }
                mc1Var.b1(false);
                mc1Var.V0();
                mc1Var.i1();
                if (mc1Var.i0 != null) {
                    for (int i17 = 0; i17 < mc1Var.i0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.j6) mc1Var.i0.get(i17)).e(mc1Var.getThemedColor(((org.telegram.ui.ActionBar.j6) mc1Var.i0.get(i17)).f), false, false);
                    }
                }
                if (mc1Var.M1) {
                    dc1 dc1Var = mc1Var.p1;
                    if (dc1Var == null || !dc1Var.a()) {
                        mc1Var.R1.a(0.0f);
                    } else {
                        mc1Var.R1.setVisibility(0);
                        mc1Var.R1.a(mc1Var.n1);
                    }
                    ValueAnimator valueAnimator = mc1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        mc1Var.P1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(mc1Var.o1, mc1Var.p1.a() ? 1.0f : 0.0f);
                    mc1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new e11(mc1Var, 11));
                    mc1Var.P1.addListener(new qb1(mc1Var, 5));
                    mc1Var.P1.setDuration(250L);
                    mc1Var.P1.setInterpolator(org.telegram.ui.Components.bs.f);
                    mc1Var.P1.start();
                    break;
                }
                break;
            default:
                if (mc1Var.getParentActivity() != null && mc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(7, mc1Var.getParentActivity(), null, true);
                    r40Var.setAlpha(0.0f);
                    r40Var.setVisibility(4);
                    r40Var.setShowingDuration(4000L);
                    mc1Var.k0.addView(r40Var, w7.z5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (mc1Var.p1.a()) {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    r40Var.d();
                    r40Var.f(mc1Var.O1, true);
                    r40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
