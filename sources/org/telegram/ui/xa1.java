package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ xa1(kc1 kc1Var, int i10) {
        this.a = i10;
        this.b = kc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        kc1 kc1Var = this.b;
        switch (i10) {
            case 0:
                kc1Var.Z = false;
                int i11 = kc1Var.W;
                int i12 = kc1Var.X;
                org.telegram.ui.ActionBar.f6 f6Var = kc1Var.s;
                int i13 = kc1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        f6Var.c = i11;
                        org.telegram.ui.ActionBar.h6.o1(false, false);
                    } else if (i12 == 1) {
                        f6Var.d = i11;
                        org.telegram.ui.ActionBar.h6.o1(true, true);
                        kc1Var.u0.f1();
                        kc1Var.V.setHasChanges(kc1Var.T0(kc1Var.n));
                        kc1Var.m1(true);
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
                    kc1Var.V.setHasChanges(kc1Var.T0(kc1Var.n));
                    kc1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        f6Var.e = i11;
                    } else if (i12 == 1) {
                        f6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = f6Var.g;
                        f6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            kc1Var.v0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            kc1Var.v0.o(0);
                            kc1Var.e1();
                        }
                    } else {
                        f6Var.h = i11;
                    }
                    int i15 = kc1Var.X;
                    if (i15 >= 0) {
                        kc1Var.K0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.h6.o1(true, true);
                    kc1Var.u0.f1();
                    kc1Var.V.setHasChanges(kc1Var.T0(kc1Var.n));
                    kc1Var.m1(true);
                }
                int size = kc1Var.i0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) kc1Var.i0.get(i16);
                    j6Var.e(kc1Var.getThemedColor(j6Var.f), false, false);
                }
                kc1Var.n0.f1();
                kc1Var.u0.f1();
                ei.g6 g6Var = kc1Var.a0;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                kc1Var.X = -1;
                break;
            case 1:
                kc1Var.presentFragment(p91.d0(kc1Var.getMessagesController().getChat(Long.valueOf(-kc1Var.J1)), true));
                break;
            case 2:
                kc1Var.p1.c1(false);
                boolean a2 = kc1Var.a.a();
                org.telegram.ui.Components.vj0 vj0Var = kc1Var.N1;
                vj0Var.P(a2 ? vj0Var.e[0] : 0);
                org.telegram.ui.Components.vj0 vj0Var2 = kc1Var.N1;
                if (vj0Var2 != null) {
                    vj0Var2.start();
                }
                kc1Var.b1(false);
                kc1Var.V0();
                kc1Var.i1();
                if (kc1Var.i0 != null) {
                    for (int i17 = 0; i17 < kc1Var.i0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.j6) kc1Var.i0.get(i17)).e(kc1Var.getThemedColor(((org.telegram.ui.ActionBar.j6) kc1Var.i0.get(i17)).f), false, false);
                    }
                }
                if (kc1Var.M1) {
                    bc1 bc1Var = kc1Var.p1;
                    if (bc1Var == null || !bc1Var.a()) {
                        kc1Var.R1.a(0.0f);
                    } else {
                        kc1Var.R1.setVisibility(0);
                        kc1Var.R1.a(kc1Var.n1);
                    }
                    ValueAnimator valueAnimator = kc1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        kc1Var.P1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(kc1Var.o1, kc1Var.p1.a() ? 1.0f : 0.0f);
                    kc1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new c11(kc1Var, 11));
                    kc1Var.P1.addListener(new ob1(kc1Var, 5));
                    kc1Var.P1.setDuration(250L);
                    kc1Var.P1.setInterpolator(org.telegram.ui.Components.bs.f);
                    kc1Var.P1.start();
                    break;
                }
                break;
            default:
                if (kc1Var.getParentActivity() != null && kc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(7, kc1Var.getParentActivity(), null, true);
                    r40Var.setAlpha(0.0f);
                    r40Var.setVisibility(4);
                    r40Var.setShowingDuration(4000L);
                    kc1Var.k0.addView(r40Var, w7.z5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (kc1Var.p1.a()) {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    r40Var.d();
                    r40Var.f(kc1Var.O1, true);
                    r40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
