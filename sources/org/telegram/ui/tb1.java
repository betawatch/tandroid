package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class tb1 implements org.telegram.ui.Components.vq {
    public final /* synthetic */ qc1 a;

    public tb1(qc1 qc1Var) {
        this.a = qc1Var;
    }

    @Override // org.telegram.ui.Components.vq
    public final void j0(int i10, int i11, boolean z10) {
        qc1 qc1Var = this.a;
        if (qc1Var.b == 2) {
            qc1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = qc1Var.Z;
        org.telegram.ui.ActionBar.i6 i6Var = qc1Var.v;
        if (i11 != -1) {
            int i12 = qc1Var.Y;
            if (i12 != -1 && i12 != i11) {
                runnable.run();
            }
            qc1Var.X = i10;
            qc1Var.Y = i11;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (qc1Var.a0) {
                    return;
                }
                qc1Var.a0 = true;
                qc1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i13 = qc1Var.n;
        if (i13 == 1 || i13 == 2) {
            long j10 = qc1Var.J;
            if (j10 != 0) {
                i6Var.j = j10;
            } else {
                i6Var.j = 0L;
            }
            long j11 = qc1Var.K;
            if (j11 != 0) {
                i6Var.k = j11;
            } else {
                i6Var.k = 0L;
            }
            long j12 = qc1Var.L;
            if (j12 != 0) {
                i6Var.l = j12;
            } else {
                i6Var.l = 0L;
            }
            long j13 = qc1Var.M;
            if (j13 != 0) {
                i6Var.m = j13;
            } else {
                i6Var.m = 0L;
            }
            i6Var.n = qc1Var.P;
            if (i13 == 2) {
                int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Nd);
                int D02 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Od);
                int D03 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                int D04 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Qd);
                int i14 = (int) i6Var.k;
                int i15 = (int) i6Var.l;
                int i16 = (int) i6Var.m;
                int i17 = (int) i6Var.j;
                org.telegram.ui.Components.wq wqVar = qc1Var.W;
                if (i16 != 0) {
                    D04 = i16;
                }
                wqVar.e(D04, 3);
                org.telegram.ui.Components.wq wqVar2 = qc1Var.W;
                if (i15 != 0) {
                    D03 = i15;
                }
                wqVar2.e(D03, 2);
                org.telegram.ui.Components.wq wqVar3 = qc1Var.W;
                if (i14 != 0) {
                    D02 = i14;
                }
                wqVar3.e(D02, 1);
                org.telegram.ui.Components.wq wqVar4 = qc1Var.W;
                if (i17 != 0) {
                    D0 = i17;
                }
                wqVar4.e(D0, 0);
            }
        }
        int i18 = qc1Var.n;
        if (i18 == 1 || i18 == 3) {
            int i19 = qc1Var.E;
            if (i19 != 0) {
                i6Var.e = i19;
            } else {
                i6Var.e = 0;
            }
            int i20 = qc1Var.F;
            if (i20 != 0) {
                i6Var.f = i20;
            } else {
                i6Var.f = 0;
            }
            int i21 = qc1Var.G;
            if (i21 != 0) {
                i6Var.g = i21;
            } else {
                i6Var.g = 0;
            }
            int i22 = qc1Var.H;
            if (i22 != 0) {
                i6Var.h = i22;
            } else {
                i6Var.h = 0;
            }
            if (i18 == 3) {
                qc1Var.W.e(i6Var.h, 3);
                qc1Var.W.e(i6Var.g, 2);
                qc1Var.W.e(i6Var.f, 1);
                org.telegram.ui.Components.wq wqVar5 = qc1Var.W;
                int i23 = i6Var.e;
                if (i23 == 0) {
                    i23 = i6Var.c;
                }
                wqVar5.e(i23, 0);
            }
        }
        org.telegram.ui.ActionBar.k6.q1(false, false);
        qc1Var.v0.g1();
    }

    @Override // org.telegram.ui.Components.vq
    public final void k(boolean z10) {
        int i10;
        int i11;
        qc1 qc1Var = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = qc1Var.v;
        if (!z10) {
            org.telegram.ui.Components.f5.W(qc1Var, 1, null, null);
            return;
        }
        if (i6Var.r == null) {
            qc1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(i6Var.b, i6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, i6Var.b, i6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount;
        sb2.append(MessagesController.getInstance(i10).linkPrefix);
        sb2.append("/addtheme/");
        sb2.append(i6Var.r.slug);
        String sb3 = sb2.toString();
        qc1Var.showDialog(new org.telegram.ui.Components.ir0(qc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.vq
    public final int r0(int i10) {
        org.telegram.ui.ActionBar.i6 i6Var;
        qc1 qc1Var = this.a;
        if (qc1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.j6 j6Var = qc1Var.f0;
        if (j6Var.S && i10 == 0 && (i6Var = (org.telegram.ui.ActionBar.i6) j6Var.a0.get(org.telegram.ui.ActionBar.k6.n)) != null) {
            return i6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.vq
    public final void u() {
        qc1 qc1Var = this.a;
        if (qc1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qc1Var.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new sp0(this, 20));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        qc1Var.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, qc1Var.a);
        }
    }
}
