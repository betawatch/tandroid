package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rb1 implements org.telegram.ui.Components.bq {
    public final /* synthetic */ oc1 a;

    public rb1(oc1 oc1Var) {
        this.a = oc1Var;
    }

    @Override // org.telegram.ui.Components.bq
    public final int H0(int i9) {
        org.telegram.ui.ActionBar.d6 d6Var;
        oc1 oc1Var = this.a;
        if (oc1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.e6 e6Var = oc1Var.a0;
        if (e6Var.O && i9 == 0 && (d6Var = (org.telegram.ui.ActionBar.d6) e6Var.W.get(org.telegram.ui.ActionBar.f6.n)) != null) {
            return d6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.bq
    public final void e(boolean z10) {
        int i9;
        int i10;
        oc1 oc1Var = this.a;
        org.telegram.ui.ActionBar.d6 d6Var = oc1Var.s;
        if (!z10) {
            org.telegram.ui.Components.y4.W(oc1Var, 1, null, null);
            return;
        }
        if (d6Var.r == null) {
            oc1Var.finishFragment();
            i10 = ((org.telegram.ui.ActionBar.o2) oc1Var).currentAccount;
            MessagesController.getInstance(i10).saveThemeToServer(d6Var.b, d6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, d6Var.b, d6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i9 = ((org.telegram.ui.ActionBar.o2) oc1Var).currentAccount;
        sb2.append(MessagesController.getInstance(i9).linkPrefix);
        sb2.append("/addtheme/");
        sb2.append(d6Var.r.slug);
        String sb3 = sb2.toString();
        oc1Var.showDialog(new org.telegram.ui.Components.rp0(oc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.bq
    public final void k() {
        oc1 oc1Var = this.a;
        if (oc1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oc1Var.getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new dl0(this, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        oc1Var.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.q7));
        }
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
    @Override // org.telegram.ui.Components.bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(int i9, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        oc1 oc1Var = this.a;
        if (oc1Var.b == 2) {
            oc1Var.a1(i9, i10, true);
            return;
        }
        Runnable runnable = oc1Var.U;
        org.telegram.ui.ActionBar.d6 d6Var = oc1Var.s;
        if (i10 != -1) {
            int i18 = oc1Var.T;
            if (i18 != -1 && i18 != i10) {
                runnable.run();
            }
            oc1Var.S = i9;
            oc1Var.T = i10;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (oc1Var.V) {
                    return;
                }
                oc1Var.V = true;
                oc1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i19 = oc1Var.n;
        if (i19 == 1 || i19 == 2) {
            long j10 = oc1Var.E;
            if (j10 != 0) {
                d6Var.j = j10;
            } else {
                d6Var.j = 0L;
            }
            long j11 = oc1Var.F;
            if (j11 != 0) {
                d6Var.k = j11;
            } else {
                d6Var.k = 0L;
            }
            long j12 = oc1Var.G;
            if (j12 != 0) {
                d6Var.l = j12;
            } else {
                d6Var.l = 0L;
            }
            long j13 = oc1Var.H;
            if (j13 != 0) {
                d6Var.m = j13;
            } else {
                d6Var.m = 0L;
            }
            d6Var.n = oc1Var.K;
            if (i19 == 2) {
                int B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Nd);
                int B02 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Od);
                int B03 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Pd);
                int B04 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Qd);
                int i20 = (int) d6Var.k;
                int i21 = (int) d6Var.l;
                int i22 = (int) d6Var.m;
                int i23 = (int) d6Var.j;
                org.telegram.ui.Components.cq cqVar = oc1Var.R;
                if (i22 != 0) {
                    B04 = i22;
                }
                cqVar.e(B04, 3);
                org.telegram.ui.Components.cq cqVar2 = oc1Var.R;
                if (i21 != 0) {
                    B03 = i21;
                }
                cqVar2.e(B03, 2);
                org.telegram.ui.Components.cq cqVar3 = oc1Var.R;
                if (i20 != 0) {
                    B02 = i20;
                }
                i11 = 1;
                cqVar3.e(B02, 1);
                org.telegram.ui.Components.cq cqVar4 = oc1Var.R;
                if (i23 != 0) {
                    B0 = i23;
                }
                cqVar4.e(B0, 0);
                i12 = oc1Var.n;
                if (i12 != i11 || i12 == 3) {
                    i13 = oc1Var.y;
                    if (i13 == 0) {
                        d6Var.e = i13;
                        i14 = 0;
                    } else {
                        i14 = 0;
                        d6Var.e = 0;
                    }
                    i15 = oc1Var.A;
                    if (i15 == 0) {
                        d6Var.f = i15;
                    } else {
                        d6Var.f = i14;
                    }
                    i16 = oc1Var.B;
                    if (i16 == 0) {
                        d6Var.g = i16;
                    } else {
                        d6Var.g = i14;
                    }
                    i17 = oc1Var.C;
                    if (i17 == 0) {
                        d6Var.h = i17;
                    } else {
                        d6Var.h = i14;
                    }
                    if (i12 == 3) {
                        oc1Var.R.e(d6Var.h, 3);
                        oc1Var.R.e(d6Var.g, 2);
                        oc1Var.R.e(d6Var.f, 1);
                        org.telegram.ui.Components.cq cqVar5 = oc1Var.R;
                        int i24 = d6Var.e;
                        if (i24 == 0) {
                            i24 = d6Var.c;
                        }
                        z11 = false;
                        cqVar5.e(i24, 0);
                        org.telegram.ui.ActionBar.f6.n1(z11, z11);
                        oc1Var.q0.f1();
                    }
                }
                z11 = false;
                org.telegram.ui.ActionBar.f6.n1(z11, z11);
                oc1Var.q0.f1();
            }
        }
        i11 = 1;
        i12 = oc1Var.n;
        if (i12 != i11) {
        }
        i13 = oc1Var.y;
        if (i13 == 0) {
        }
        i15 = oc1Var.A;
        if (i15 == 0) {
        }
        i16 = oc1Var.B;
        if (i16 == 0) {
        }
        i17 = oc1Var.C;
        if (i17 == 0) {
        }
        if (i12 == 3) {
        }
        z11 = false;
        org.telegram.ui.ActionBar.f6.n1(z11, z11);
        oc1Var.q0.f1();
    }
}
