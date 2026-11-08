package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class z61 implements org.telegram.ui.Components.up {
    public final /* synthetic */ v71 a;

    public z61(v71 v71Var) {
        this.a = v71Var;
    }

    @Override // org.telegram.ui.Components.up
    public final void a(boolean z9) {
        int i7;
        int i10;
        v71 v71Var = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = v71Var.w;
        if (!z9) {
            org.telegram.ui.Components.v4.T(v71Var, 1, null, null);
            return;
        }
        if (h6Var.r == null) {
            v71Var.finishFragment();
            i10 = ((org.telegram.ui.ActionBar.f2) v71Var).currentAccount;
            org.telegram.messenger.qp.s1(i10).y4(h6Var.b, h6Var);
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.s4, h6Var.b, h6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i7 = ((org.telegram.ui.ActionBar.f2) v71Var).currentAccount;
        sb2.append(org.telegram.messenger.qp.s1(i7).U2);
        sb2.append("/addtheme/");
        sb2.append(h6Var.r.slug);
        String sb3 = sb2.toString();
        v71Var.showDialog(new org.telegram.ui.Components.mo0(v71Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.up
    public final void b() {
        v71 v71Var = this.a;
        if (v71Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v71Var.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131751485, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131751486, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new li0(this, 19));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        v71Var.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, v71Var.a);
        }
    }

    @Override // org.telegram.ui.Components.up
    public final void c(int i7, int i10, boolean z9) {
        v71 v71Var = this.a;
        if (v71Var.b == 2) {
            v71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = v71Var.Z;
        org.telegram.ui.ActionBar.h6 h6Var = v71Var.w;
        if (i10 != -1) {
            int i11 = v71Var.Y;
            if (i11 != -1 && i11 != i10) {
                runnable.run();
            }
            v71Var.X = i7;
            v71Var.Y = i10;
            if (z9) {
                runnable.run();
                return;
            } else {
                if (v71Var.a0) {
                    return;
                }
                v71Var.a0 = true;
                v71Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i12 = v71Var.n;
        if (i12 == 1 || i12 == 2) {
            long j3 = v71Var.J;
            if (j3 != 0) {
                h6Var.j = j3;
            } else {
                h6Var.j = 0L;
            }
            long j10 = v71Var.K;
            if (j10 != 0) {
                h6Var.k = j10;
            } else {
                h6Var.k = 0L;
            }
            long j11 = v71Var.L;
            if (j11 != 0) {
                h6Var.l = j11;
            } else {
                h6Var.l = 0L;
            }
            long j12 = v71Var.M;
            if (j12 != 0) {
                h6Var.m = j12;
            } else {
                h6Var.m = 0L;
            }
            h6Var.n = v71Var.P;
            if (i12 == 2) {
                int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
                int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                int E04 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                int i13 = (int) h6Var.k;
                int i14 = (int) h6Var.l;
                int i15 = (int) h6Var.m;
                int i16 = (int) h6Var.j;
                org.telegram.ui.Components.vp vpVar = v71Var.W;
                if (i15 != 0) {
                    E04 = i15;
                }
                vpVar.e(E04, 3);
                org.telegram.ui.Components.vp vpVar2 = v71Var.W;
                if (i14 != 0) {
                    E03 = i14;
                }
                vpVar2.e(E03, 2);
                org.telegram.ui.Components.vp vpVar3 = v71Var.W;
                if (i13 != 0) {
                    E02 = i13;
                }
                vpVar3.e(E02, 1);
                org.telegram.ui.Components.vp vpVar4 = v71Var.W;
                if (i16 != 0) {
                    E0 = i16;
                }
                vpVar4.e(E0, 0);
            }
        }
        int i17 = v71Var.n;
        if (i17 == 1 || i17 == 3) {
            int i18 = v71Var.E;
            if (i18 != 0) {
                h6Var.e = i18;
            } else {
                h6Var.e = 0;
            }
            int i19 = v71Var.F;
            if (i19 != 0) {
                h6Var.f = i19;
            } else {
                h6Var.f = 0;
            }
            int i20 = v71Var.G;
            if (i20 != 0) {
                h6Var.g = i20;
            } else {
                h6Var.g = 0;
            }
            int i21 = v71Var.H;
            if (i21 != 0) {
                h6Var.h = i21;
            } else {
                h6Var.h = 0;
            }
            if (i17 == 3) {
                v71Var.W.e(h6Var.h, 3);
                v71Var.W.e(h6Var.g, 2);
                v71Var.W.e(h6Var.f, 1);
                org.telegram.ui.Components.vp vpVar5 = v71Var.W;
                int i22 = h6Var.e;
                if (i22 == 0) {
                    i22 = h6Var.c;
                }
                vpVar5.e(i22, 0);
            }
        }
        org.telegram.ui.ActionBar.k6.t1(false, false);
        v71Var.v0.g1();
    }

    @Override // org.telegram.ui.Components.up
    public final int d(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var;
        v71 v71Var = this.a;
        if (v71Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.j6 j6Var = v71Var.f0;
        if (j6Var.S && i7 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) j6Var.a0.get(org.telegram.ui.ActionBar.k6.n)) != null) {
            return h6Var.e;
        }
        return 0;
    }
}
