package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd1 b;

    public /* synthetic */ wb1(jd1 jd1Var, int i10) {
        this.a = i10;
        this.b = jd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        jd1 jd1Var = this.b;
        switch (i10) {
            case 0:
                jd1Var.W = false;
                int i11 = jd1Var.T;
                int i12 = jd1Var.U;
                org.telegram.ui.ActionBar.h6 h6Var = jd1Var.s;
                int i13 = jd1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        h6Var.c = i11;
                        org.telegram.ui.ActionBar.j6.n1(false, false);
                    } else if (i12 == 1) {
                        h6Var.d = i11;
                        org.telegram.ui.ActionBar.j6.n1(true, true);
                        jd1Var.r0.e1();
                        jd1Var.S.setHasChanges(jd1Var.T0(jd1Var.n));
                        jd1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        h6Var.j = i11;
                    } else if (i12 == 1) {
                        int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        if (i11 != 0 || B0 == 0) {
                            h6Var.k = i11;
                        } else {
                            h6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        if (i11 != 0 || B02 == 0) {
                            h6Var.l = i11;
                        } else {
                            h6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        if (i11 != 0 || B03 == 0) {
                            h6Var.m = i11;
                        } else {
                            h6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, false);
                    jd1Var.S.setHasChanges(jd1Var.T0(jd1Var.n));
                    jd1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        h6Var.e = i11;
                    } else if (i12 == 1) {
                        h6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = h6Var.g;
                        h6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            jd1Var.s0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            jd1Var.s0.o(0);
                            jd1Var.e1();
                        }
                    } else {
                        h6Var.h = i11;
                    }
                    int i15 = jd1Var.U;
                    if (i15 >= 0) {
                        jd1Var.H0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    jd1Var.r0.e1();
                    jd1Var.S.setHasChanges(jd1Var.T0(jd1Var.n));
                    jd1Var.m1(true);
                }
                int size = jd1Var.f0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) jd1Var.f0.get(i16);
                    l6Var.d(jd1Var.getThemedColor(l6Var.f), false, false);
                }
                jd1Var.k0.e1();
                jd1Var.r0.e1();
                eg.i0 i0Var = jd1Var.X;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                jd1Var.U = -1;
                break;
            case 1:
                jd1Var.presentFragment(oa1.d0(jd1Var.getMessagesController().getChat(Long.valueOf(-jd1Var.G1)), true));
                break;
            case 2:
                jd1Var.m1.l1(false);
                boolean a2 = jd1Var.a.a();
                org.telegram.ui.Components.gj0 gj0Var = jd1Var.K1;
                gj0Var.N(a2 ? gj0Var.e[0] : 0);
                org.telegram.ui.Components.gj0 gj0Var2 = jd1Var.K1;
                if (gj0Var2 != null) {
                    gj0Var2.start();
                }
                jd1Var.b1(false);
                jd1Var.V0();
                jd1Var.i1();
                if (jd1Var.f0 != null) {
                    for (int i17 = 0; i17 < jd1Var.f0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.l6) jd1Var.f0.get(i17)).d(jd1Var.getThemedColor(((org.telegram.ui.ActionBar.l6) jd1Var.f0.get(i17)).f), false, false);
                    }
                }
                if (jd1Var.J1) {
                    ad1 ad1Var = jd1Var.m1;
                    if (ad1Var == null || !ad1Var.a()) {
                        jd1Var.O1.a(0.0f);
                    } else {
                        jd1Var.O1.setVisibility(0);
                        jd1Var.O1.a(jd1Var.k1);
                    }
                    ValueAnimator valueAnimator = jd1Var.M1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        jd1Var.M1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(jd1Var.l1, jd1Var.m1.a() ? 1.0f : 0.0f);
                    jd1Var.M1 = ofFloat;
                    ofFloat.addUpdateListener(new o11(jd1Var, 13));
                    jd1Var.M1.addListener(new nc1(jd1Var, 5));
                    jd1Var.M1.setDuration(250L);
                    jd1Var.M1.setInterpolator(org.telegram.ui.Components.mr.f);
                    jd1Var.M1.start();
                    break;
                }
                break;
            default:
                if (jd1Var.getParentActivity() != null && jd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(7, jd1Var.getParentActivity(), null, true);
                    l40Var.setAlpha(0.0f);
                    l40Var.setVisibility(4);
                    l40Var.setShowingDuration(4000L);
                    jd1Var.h0.addView(l40Var, k7.b6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (jd1Var.m1.a()) {
                        l40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        l40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    l40Var.d();
                    l40Var.f(jd1Var.L1, true);
                    l40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
