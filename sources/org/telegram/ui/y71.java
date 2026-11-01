package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k91 b;

    public /* synthetic */ y71(k91 k91Var, int i10) {
        this.a = i10;
        this.b = k91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        k91 k91Var = this.b;
        switch (i10) {
            case 0:
                k91Var.a0 = false;
                int i11 = k91Var.X;
                int i12 = k91Var.Y;
                org.telegram.ui.ActionBar.r6 r6Var = k91Var.w;
                int i13 = k91Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        r6Var.c = i11;
                        org.telegram.ui.ActionBar.t6.t1(false, false);
                    } else if (i12 == 1) {
                        r6Var.d = i11;
                        org.telegram.ui.ActionBar.t6.t1(true, true);
                        k91Var.v0.g1();
                        k91Var.W.setHasChanges(k91Var.Y0(k91Var.n));
                        k91Var.r1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        r6Var.j = i11;
                    } else if (i12 == 1) {
                        int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                        if (i11 != 0 || E0 == 0) {
                            r6Var.k = i11;
                        } else {
                            r6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                        if (i11 != 0 || E02 == 0) {
                            r6Var.l = i11;
                        } else {
                            r6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int E03 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                        if (i11 != 0 || E03 == 0) {
                            r6Var.m = i11;
                        } else {
                            r6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.t6.t1(true, false);
                    k91Var.W.setHasChanges(k91Var.Y0(k91Var.n));
                    k91Var.r1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        r6Var.e = i11;
                    } else if (i12 == 1) {
                        r6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = r6Var.g;
                        r6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            k91Var.w0.s(0);
                        } else if (i14 == 0 && i11 != 0) {
                            k91Var.w0.i(0);
                            k91Var.j1();
                        }
                    } else {
                        r6Var.h = i11;
                    }
                    int i15 = k91Var.Y;
                    if (i15 >= 0) {
                        k91Var.L0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.t6.t1(true, true);
                    k91Var.v0.g1();
                    k91Var.W.setHasChanges(k91Var.Y0(k91Var.n));
                    k91Var.r1(true);
                }
                int size = k91Var.j0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) k91Var.j0.get(i16);
                    c7Var.e(k91Var.getThemedColor(c7Var.e), false, false);
                }
                k91Var.o0.g1();
                k91Var.v0.g1();
                kg.f0 f0Var = k91Var.b0;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
                k91Var.Y = -1;
                break;
            case 1:
                k91Var.presentFragment(s61.g0(k91Var.getMessagesController().L0(Long.valueOf(-k91Var.K1)), true));
                break;
            case 2:
                k91Var.q1.M1(false);
                boolean a2 = k91Var.a.a();
                org.telegram.ui.Components.ci0 ci0Var = k91Var.O1;
                ci0Var.P(a2 ? ci0Var.e[0] : 0);
                org.telegram.ui.Components.ci0 ci0Var2 = k91Var.O1;
                if (ci0Var2 != null) {
                    ci0Var2.start();
                }
                k91Var.g1(false);
                k91Var.a1();
                k91Var.n1();
                if (k91Var.j0 != null) {
                    for (int i17 = 0; i17 < k91Var.j0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.c7) k91Var.j0.get(i17)).e(k91Var.getThemedColor(((org.telegram.ui.ActionBar.c7) k91Var.j0.get(i17)).e), false, false);
                    }
                }
                if (k91Var.N1) {
                    c91 c91Var = k91Var.q1;
                    if (c91Var == null || !c91Var.a()) {
                        k91Var.S1.a(0.0f);
                    } else {
                        k91Var.S1.setVisibility(0);
                        k91Var.S1.a(k91Var.o1);
                    }
                    ValueAnimator valueAnimator = k91Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        k91Var.Q1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(k91Var.p1, k91Var.q1.a() ? 1.0f : 0.0f);
                    k91Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new u01(k91Var, 9));
                    k91Var.Q1.addListener(new p81(k91Var, 5));
                    k91Var.Q1.setDuration(250L);
                    k91Var.Q1.setInterpolator(org.telegram.ui.Components.gr.f);
                    k91Var.Q1.start();
                    break;
                }
                break;
            default:
                if (k91Var.getParentActivity() != null && k91Var.getParentActivity() != null) {
                    int i18 = org.telegram.messenger.uz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    int i19 = org.telegram.messenger.uz.S + 1;
                    org.telegram.messenger.uz.S = i19;
                    edit.putInt("dayNightWallpaperSwitchHint", i19);
                    edit.apply();
                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(7, k91Var.getParentActivity(), null, true);
                    q30Var.setAlpha(0.0f);
                    q30Var.setVisibility(4);
                    q30Var.setShowingDuration(4000L);
                    k91Var.l0.addView(q30Var, w7.b6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (k91Var.q1.a()) {
                        q30Var.setText(org.telegram.messenger.dd.L0(2131746893, null));
                    } else {
                        q30Var.setText(org.telegram.messenger.dd.L0(2131746892, null));
                    }
                    q30Var.d();
                    q30Var.f(k91Var.P1, true);
                    q30Var.setExtraTranslationY(-org.telegram.messenger.i0.L(14.0f));
                    break;
                }
                break;
        }
    }
}
