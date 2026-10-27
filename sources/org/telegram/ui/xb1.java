package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xb1 implements org.telegram.ui.Components.xq {
    public final /* synthetic */ vc1 a;

    public xb1(vc1 vc1Var) {
        this.a = vc1Var;
    }

    @Override // org.telegram.ui.Components.xq
    public final int M0(int i10) {
        org.telegram.ui.ActionBar.w6 w6Var;
        vc1 vc1Var = this.a;
        if (vc1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.x6 x6Var = vc1Var.f0;
        if (x6Var.S && i10 == 0 && (w6Var = (org.telegram.ui.ActionBar.w6) x6Var.a0.get(org.telegram.ui.ActionBar.y6.n)) != null) {
            return w6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.xq
    public final void k(boolean z10) {
        int i10;
        int i11;
        vc1 vc1Var = this.a;
        org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
        if (!z10) {
            org.telegram.ui.Components.g5.V(vc1Var, 1, null, null);
            return;
        }
        if (w6Var.r == null) {
            vc1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.r2) vc1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(w6Var.b, w6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, w6Var.b, w6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.r2) vc1Var).currentAccount;
        sb2.append(MessagesController.getInstance(i10).linkPrefix);
        sb2.append("/addtheme/");
        sb2.append(w6Var.r.slug);
        String sb3 = sb2.toString();
        vc1Var.showDialog(new org.telegram.ui.Components.nr0(vc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.xq
    public final void w() {
        vc1 vc1Var = this.a;
        if (vc1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vc1Var.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jl0(this, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        vc1Var.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, vc1Var.a);
        }
    }

    @Override // org.telegram.ui.Components.xq
    public final void x0(int i10, int i11, boolean z10) {
        vc1 vc1Var = this.a;
        if (vc1Var.b == 2) {
            vc1Var.b1(i10, i11, true);
            return;
        }
        Runnable runnable = vc1Var.Z;
        org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
        if (i11 != -1) {
            int i12 = vc1Var.Y;
            if (i12 != -1 && i12 != i11) {
                runnable.run();
            }
            vc1Var.X = i10;
            vc1Var.Y = i11;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (vc1Var.a0) {
                    return;
                }
                vc1Var.a0 = true;
                vc1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i13 = vc1Var.n;
        if (i13 == 1 || i13 == 2) {
            long j10 = vc1Var.J;
            if (j10 != 0) {
                w6Var.j = j10;
            } else {
                w6Var.j = 0L;
            }
            long j11 = vc1Var.K;
            if (j11 != 0) {
                w6Var.k = j11;
            } else {
                w6Var.k = 0L;
            }
            long j12 = vc1Var.L;
            if (j12 != 0) {
                w6Var.l = j12;
            } else {
                w6Var.l = 0L;
            }
            long j13 = vc1Var.M;
            if (j13 != 0) {
                w6Var.m = j13;
            } else {
                w6Var.m = 0L;
            }
            w6Var.n = vc1Var.P;
            if (i13 == 2) {
                int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Nd);
                int D02 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                int D03 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                int D04 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Qd);
                int i14 = (int) w6Var.k;
                int i15 = (int) w6Var.l;
                int i16 = (int) w6Var.m;
                int i17 = (int) w6Var.j;
                org.telegram.ui.Components.yq yqVar = vc1Var.W;
                if (i16 != 0) {
                    D04 = i16;
                }
                yqVar.e(D04, 3);
                org.telegram.ui.Components.yq yqVar2 = vc1Var.W;
                if (i15 != 0) {
                    D03 = i15;
                }
                yqVar2.e(D03, 2);
                org.telegram.ui.Components.yq yqVar3 = vc1Var.W;
                if (i14 != 0) {
                    D02 = i14;
                }
                yqVar3.e(D02, 1);
                org.telegram.ui.Components.yq yqVar4 = vc1Var.W;
                if (i17 != 0) {
                    D0 = i17;
                }
                yqVar4.e(D0, 0);
            }
        }
        int i18 = vc1Var.n;
        if (i18 == 1 || i18 == 3) {
            int i19 = vc1Var.E;
            if (i19 != 0) {
                w6Var.e = i19;
            } else {
                w6Var.e = 0;
            }
            int i20 = vc1Var.F;
            if (i20 != 0) {
                w6Var.f = i20;
            } else {
                w6Var.f = 0;
            }
            int i21 = vc1Var.G;
            if (i21 != 0) {
                w6Var.g = i21;
            } else {
                w6Var.g = 0;
            }
            int i22 = vc1Var.H;
            if (i22 != 0) {
                w6Var.h = i22;
            } else {
                w6Var.h = 0;
            }
            if (i18 == 3) {
                vc1Var.W.e(w6Var.h, 3);
                vc1Var.W.e(w6Var.g, 2);
                vc1Var.W.e(w6Var.f, 1);
                org.telegram.ui.Components.yq yqVar5 = vc1Var.W;
                int i23 = w6Var.e;
                if (i23 == 0) {
                    i23 = w6Var.c;
                }
                yqVar5.e(i23, 0);
            }
        }
        org.telegram.ui.ActionBar.y6.q1(false, false);
        vc1Var.v0.g1();
    }
}
