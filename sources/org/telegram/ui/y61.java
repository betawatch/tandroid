package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y61 implements org.telegram.ui.Components.iq {
    public final /* synthetic */ v71 a;

    public y61(v71 v71Var) {
        this.a = v71Var;
    }

    @Override // org.telegram.ui.Components.iq
    public final void a(boolean z10) {
        int i7;
        int i10;
        v71 v71Var = this.a;
        org.telegram.ui.ActionBar.k6 k6Var = v71Var.w;
        if (!z10) {
            org.telegram.ui.Components.b5.T(v71Var, 1, null, null);
            return;
        }
        if (k6Var.r == null) {
            v71Var.finishFragment();
            i10 = ((org.telegram.ui.ActionBar.g2) v71Var).currentAccount;
            org.telegram.messenger.mp.u1(i10).H4(k6Var.b, k6Var);
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.v4, k6Var.b, k6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i7 = ((org.telegram.ui.ActionBar.g2) v71Var).currentAccount;
        sb2.append(org.telegram.messenger.mp.u1(i7).X2);
        sb2.append("/addtheme/");
        sb2.append(k6Var.r.slug);
        String sb3 = sb2.toString();
        v71Var.showDialog(new org.telegram.ui.Components.zo0(v71Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.iq
    public final void b() {
        v71 v71Var = this.a;
        if (v71Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v71Var.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131751472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131751473, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new oi0(this, 19));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        v71Var.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, v71Var.a);
        }
    }

    @Override // org.telegram.ui.Components.iq
    public final void c(int i7, int i10, boolean z10) {
        v71 v71Var = this.a;
        if (v71Var.b == 2) {
            v71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = v71Var.a0;
        org.telegram.ui.ActionBar.k6 k6Var = v71Var.w;
        if (i10 != -1) {
            int i11 = v71Var.Z;
            if (i11 != -1 && i11 != i10) {
                runnable.run();
            }
            v71Var.Y = i7;
            v71Var.Z = i10;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (v71Var.b0) {
                    return;
                }
                v71Var.b0 = true;
                v71Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i12 = v71Var.n;
        if (i12 == 1 || i12 == 2) {
            long j3 = v71Var.K;
            if (j3 != 0) {
                k6Var.j = j3;
            } else {
                k6Var.j = 0L;
            }
            long j10 = v71Var.L;
            if (j10 != 0) {
                k6Var.k = j10;
            } else {
                k6Var.k = 0L;
            }
            long j11 = v71Var.M;
            if (j11 != 0) {
                k6Var.l = j11;
            } else {
                k6Var.l = 0L;
            }
            long j12 = v71Var.N;
            if (j12 != 0) {
                k6Var.m = j12;
            } else {
                k6Var.m = 0L;
            }
            k6Var.n = v71Var.Q;
            if (i12 == 2) {
                int E0 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ee);
                int E02 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Fe);
                int E03 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ge);
                int E04 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.He);
                int i13 = (int) k6Var.k;
                int i14 = (int) k6Var.l;
                int i15 = (int) k6Var.m;
                int i16 = (int) k6Var.j;
                org.telegram.ui.Components.jq jqVar = v71Var.X;
                if (i15 != 0) {
                    E04 = i15;
                }
                jqVar.e(E04, 3);
                org.telegram.ui.Components.jq jqVar2 = v71Var.X;
                if (i14 != 0) {
                    E03 = i14;
                }
                jqVar2.e(E03, 2);
                org.telegram.ui.Components.jq jqVar3 = v71Var.X;
                if (i13 != 0) {
                    E02 = i13;
                }
                jqVar3.e(E02, 1);
                org.telegram.ui.Components.jq jqVar4 = v71Var.X;
                if (i16 != 0) {
                    E0 = i16;
                }
                jqVar4.e(E0, 0);
            }
        }
        int i17 = v71Var.n;
        if (i17 == 1 || i17 == 3) {
            int i18 = v71Var.F;
            if (i18 != 0) {
                k6Var.e = i18;
            } else {
                k6Var.e = 0;
            }
            int i19 = v71Var.G;
            if (i19 != 0) {
                k6Var.f = i19;
            } else {
                k6Var.f = 0;
            }
            int i20 = v71Var.H;
            if (i20 != 0) {
                k6Var.g = i20;
            } else {
                k6Var.g = 0;
            }
            int i21 = v71Var.I;
            if (i21 != 0) {
                k6Var.h = i21;
            } else {
                k6Var.h = 0;
            }
            if (i17 == 3) {
                v71Var.X.e(k6Var.h, 3);
                v71Var.X.e(k6Var.g, 2);
                v71Var.X.e(k6Var.f, 1);
                org.telegram.ui.Components.jq jqVar5 = v71Var.X;
                int i22 = k6Var.e;
                if (i22 == 0) {
                    i22 = k6Var.c;
                }
                jqVar5.e(i22, 0);
            }
        }
        org.telegram.ui.ActionBar.n6.t1(false, false);
        v71Var.w0.g1();
    }

    @Override // org.telegram.ui.Components.iq
    public final int d(int i7) {
        org.telegram.ui.ActionBar.k6 k6Var;
        v71 v71Var = this.a;
        if (v71Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.m6 m6Var = v71Var.g0;
        if (m6Var.T && i7 == 0 && (k6Var = (org.telegram.ui.ActionBar.k6) m6Var.b0.get(org.telegram.ui.ActionBar.n6.n)) != null) {
            return k6Var.e;
        }
        return 0;
    }
}
