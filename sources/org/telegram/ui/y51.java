package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l71 b;

    public /* synthetic */ y51(l71 l71Var, int i3) {
        this.a = i3;
        this.b = l71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        l71 l71Var = this.b;
        switch (i3) {
            case 0:
                l71Var.b0 = false;
                int i10 = l71Var.Y;
                int i11 = l71Var.Z;
                org.telegram.ui.ActionBar.g6 g6Var = l71Var.w;
                int i12 = l71Var.n;
                if (i12 == 1) {
                    if (i11 == 0) {
                        g6Var.c = i10;
                        org.telegram.ui.ActionBar.k6.t1(false, false);
                    } else if (i11 == 1) {
                        g6Var.d = i10;
                        org.telegram.ui.ActionBar.k6.t1(true, true);
                        l71Var.w0.g1();
                        l71Var.X.setHasChanges(l71Var.Y0(l71Var.n));
                        l71Var.r1(true);
                    }
                } else if (i12 == 2) {
                    if (i11 == 0) {
                        g6Var.j = i10;
                    } else if (i11 == 1) {
                        int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                        if (i10 != 0 || E0 == 0) {
                            g6Var.k = i10;
                        } else {
                            g6Var.k = 4294967296L;
                        }
                    } else if (i11 == 2) {
                        int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                        if (i10 != 0 || E02 == 0) {
                            g6Var.l = i10;
                        } else {
                            g6Var.l = 4294967296L;
                        }
                    } else if (i11 == 3) {
                        int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                        if (i10 != 0 || E03 == 0) {
                            g6Var.m = i10;
                        } else {
                            g6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.k6.t1(true, false);
                    l71Var.X.setHasChanges(l71Var.Y0(l71Var.n));
                    l71Var.r1(true);
                } else if (i12 == 3) {
                    if (i11 == 0) {
                        g6Var.e = i10;
                    } else if (i11 == 1) {
                        g6Var.f = i10;
                    } else if (i11 == 2) {
                        int i13 = g6Var.g;
                        g6Var.g = i10;
                        if (i13 != 0 && i10 == 0) {
                            l71Var.x0.s(0);
                        } else if (i13 == 0 && i10 != 0) {
                            l71Var.x0.i(0);
                            l71Var.j1();
                        }
                    } else {
                        g6Var.h = i10;
                    }
                    int i14 = l71Var.Z;
                    if (i14 >= 0) {
                        l71Var.M0[1].b(i14, i10);
                    }
                    org.telegram.ui.ActionBar.k6.t1(true, true);
                    l71Var.w0.g1();
                    l71Var.X.setHasChanges(l71Var.Y0(l71Var.n));
                    l71Var.r1(true);
                }
                int size = l71Var.k0.size();
                for (int i15 = 0; i15 < size; i15++) {
                    org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) l71Var.k0.get(i15);
                    t6Var.e(l71Var.getThemedColor(t6Var.e), false, false);
                }
                l71Var.p0.g1();
                l71Var.w0.g1();
                gi.n5 n5Var = l71Var.c0;
                if (n5Var != null) {
                    n5Var.invalidate();
                }
                l71Var.Z = -1;
                break;
            case 1:
                l71Var.presentFragment(r41.g0(l71Var.getMessagesController().M0(Long.valueOf(-l71Var.L1)), true));
                break;
            case 2:
                l71Var.r1.l1(false);
                boolean a10 = l71Var.a.a();
                org.telegram.ui.Components.ch0 ch0Var = l71Var.P1;
                ch0Var.P(a10 ? ch0Var.e[0] : 0);
                org.telegram.ui.Components.ch0 ch0Var2 = l71Var.P1;
                if (ch0Var2 != null) {
                    ch0Var2.start();
                }
                l71Var.g1(false);
                l71Var.a1();
                l71Var.n1();
                if (l71Var.k0 != null) {
                    for (int i16 = 0; i16 < l71Var.k0.size(); i16++) {
                        ((org.telegram.ui.ActionBar.t6) l71Var.k0.get(i16)).e(l71Var.getThemedColor(((org.telegram.ui.ActionBar.t6) l71Var.k0.get(i16)).e), false, false);
                    }
                }
                if (l71Var.O1) {
                    d71 d71Var = l71Var.r1;
                    if (d71Var == null || !d71Var.a()) {
                        l71Var.T1.a(0.0f);
                    } else {
                        l71Var.T1.setVisibility(0);
                        l71Var.T1.a(l71Var.p1);
                    }
                    ValueAnimator valueAnimator = l71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        l71Var.R1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(l71Var.q1, l71Var.r1.a() ? 1.0f : 0.0f);
                    l71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new xy0(l71Var, 9));
                    l71Var.R1.addListener(new q61(l71Var, 5));
                    l71Var.R1.setDuration(250L);
                    l71Var.R1.setInterpolator(org.telegram.ui.Components.xq.f);
                    l71Var.R1.start();
                    break;
                }
                break;
            default:
                if (l71Var.getParentActivity() != null && l71Var.getParentActivity() != null) {
                    int i17 = org.telegram.messenger.az.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    int i18 = org.telegram.messenger.az.S + 1;
                    org.telegram.messenger.az.S = i18;
                    edit.putInt("dayNightWallpaperSwitchHint", i18);
                    edit.apply();
                    org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(7, l71Var.getParentActivity(), null, true);
                    u20Var.setAlpha(0.0f);
                    u20Var.setVisibility(4);
                    u20Var.setShowingDuration(4000L);
                    l71Var.m0.addView(u20Var, b8.mf.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (l71Var.r1.a()) {
                        u20Var.setText(org.telegram.messenger.bd.M0(2131746886, null));
                    } else {
                        u20Var.setText(org.telegram.messenger.bd.M0(2131746885, null));
                    }
                    u20Var.b();
                    u20Var.c(l71Var.Q1);
                    u20Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    break;
                }
                break;
        }
    }
}
