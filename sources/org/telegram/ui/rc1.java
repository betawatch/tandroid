package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class rc1 implements org.telegram.ui.Components.mq {
    public final /* synthetic */ od1 a;

    public rc1(od1 od1Var) {
        this.a = od1Var;
    }

    @Override // org.telegram.ui.Components.mq
    public final int K0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        od1 od1Var = this.a;
        if (od1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.g6 g6Var = od1Var.e0;
        if (g6Var.S && i10 == 0 && (f6Var = (org.telegram.ui.ActionBar.f6) g6Var.a0.get(org.telegram.ui.ActionBar.h6.n)) != null) {
            return f6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.mq
    public final void l(boolean z10) {
        int i10;
        int i11;
        od1 od1Var = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = od1Var.s;
        if (!z10) {
            org.telegram.ui.Components.e5.W(od1Var, 1, null, null);
            return;
        }
        if (f6Var.r == null) {
            od1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.m2) od1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(f6Var.b, f6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var.b, f6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.m2) od1Var).currentAccount;
        sb2.append(MessagesController.getInstance(i10).linkPrefix);
        sb2.append("/addtheme/");
        sb2.append(f6Var.r.slug);
        String sb3 = sb2.toString();
        od1Var.showDialog(new org.telegram.ui.Components.uq0(od1Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    @Override // org.telegram.ui.Components.mq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0(int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        od1 od1Var = this.a;
        if (od1Var.b == 2) {
            od1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = od1Var.Y;
        org.telegram.ui.ActionBar.f6 f6Var = od1Var.s;
        if (i11 != -1) {
            int i19 = od1Var.X;
            if (i19 != -1 && i19 != i11) {
                runnable.run();
            }
            od1Var.W = i10;
            od1Var.X = i11;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (od1Var.Z) {
                    return;
                }
                od1Var.Z = true;
                od1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i20 = od1Var.n;
        if (i20 == 1 || i20 == 2) {
            long j3 = od1Var.I;
            if (j3 != 0) {
                f6Var.j = j3;
            } else {
                f6Var.j = 0L;
            }
            long j10 = od1Var.J;
            if (j10 != 0) {
                f6Var.k = j10;
            } else {
                f6Var.k = 0L;
            }
            long j11 = od1Var.K;
            if (j11 != 0) {
                f6Var.l = j11;
            } else {
                f6Var.l = 0L;
            }
            long j12 = od1Var.L;
            if (j12 != 0) {
                f6Var.m = j12;
            } else {
                f6Var.m = 0L;
            }
            f6Var.n = od1Var.O;
            if (i20 == 2) {
                int B0 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Nd);
                int B02 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Od);
                int B03 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Pd);
                int B04 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Qd);
                int i21 = (int) f6Var.k;
                int i22 = (int) f6Var.l;
                int i23 = (int) f6Var.m;
                int i24 = (int) f6Var.j;
                org.telegram.ui.Components.nq nqVar = od1Var.V;
                if (i23 != 0) {
                    B04 = i23;
                }
                nqVar.e(B04, 3);
                org.telegram.ui.Components.nq nqVar2 = od1Var.V;
                if (i22 != 0) {
                    B03 = i22;
                }
                nqVar2.e(B03, 2);
                org.telegram.ui.Components.nq nqVar3 = od1Var.V;
                if (i21 != 0) {
                    B02 = i21;
                }
                i12 = 1;
                nqVar3.e(B02, 1);
                org.telegram.ui.Components.nq nqVar4 = od1Var.V;
                if (i24 != 0) {
                    B0 = i24;
                }
                nqVar4.e(B0, 0);
                i13 = od1Var.n;
                if (i13 != i12 || i13 == 3) {
                    i14 = od1Var.y;
                    if (i14 == 0) {
                        f6Var.e = i14;
                        i15 = 0;
                    } else {
                        i15 = 0;
                        f6Var.e = 0;
                    }
                    i16 = od1Var.E;
                    if (i16 == 0) {
                        f6Var.f = i16;
                    } else {
                        f6Var.f = i15;
                    }
                    i17 = od1Var.F;
                    if (i17 == 0) {
                        f6Var.g = i17;
                    } else {
                        f6Var.g = i15;
                    }
                    i18 = od1Var.G;
                    if (i18 == 0) {
                        f6Var.h = i18;
                    } else {
                        f6Var.h = i15;
                    }
                    if (i13 == 3) {
                        od1Var.V.e(f6Var.h, 3);
                        od1Var.V.e(f6Var.g, 2);
                        od1Var.V.e(f6Var.f, 1);
                        org.telegram.ui.Components.nq nqVar5 = od1Var.V;
                        int i25 = f6Var.e;
                        if (i25 == 0) {
                            i25 = f6Var.c;
                        }
                        z11 = false;
                        nqVar5.e(i25, 0);
                        org.telegram.ui.ActionBar.h6.n1(z11, z11);
                        od1Var.u0.f1();
                    }
                }
                z11 = false;
                org.telegram.ui.ActionBar.h6.n1(z11, z11);
                od1Var.u0.f1();
            }
        }
        i12 = 1;
        i13 = od1Var.n;
        if (i13 != i12) {
        }
        i14 = od1Var.y;
        if (i14 == 0) {
        }
        i16 = od1Var.E;
        if (i16 == 0) {
        }
        i17 = od1Var.F;
        if (i17 == 0) {
        }
        i18 = od1Var.G;
        if (i18 == 0) {
        }
        if (i13 == 3) {
        }
        z11 = false;
        org.telegram.ui.ActionBar.h6.n1(z11, z11);
        od1Var.u0.f1();
    }

    @Override // org.telegram.ui.Components.mq
    public final void y() {
        od1 od1Var = this.a;
        if (od1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(od1Var.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ml0(this, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        od1Var.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(od1Var.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
    }
}
