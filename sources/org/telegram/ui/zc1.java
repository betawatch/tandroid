package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class zc1 implements org.telegram.ui.Components.kq {
    public final /* synthetic */ wd1 a;

    public zc1(wd1 wd1Var) {
        this.a = wd1Var;
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
    @Override // org.telegram.ui.Components.kq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        wd1 wd1Var = this.a;
        if (wd1Var.b == 2) {
            wd1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = wd1Var.Y;
        org.telegram.ui.ActionBar.h6 h6Var = wd1Var.s;
        if (i11 != -1) {
            int i19 = wd1Var.X;
            if (i19 != -1 && i19 != i11) {
                runnable.run();
            }
            wd1Var.W = i10;
            wd1Var.X = i11;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (wd1Var.Z) {
                    return;
                }
                wd1Var.Z = true;
                wd1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i20 = wd1Var.n;
        if (i20 == 1 || i20 == 2) {
            long j3 = wd1Var.I;
            if (j3 != 0) {
                h6Var.j = j3;
            } else {
                h6Var.j = 0L;
            }
            long j10 = wd1Var.J;
            if (j10 != 0) {
                h6Var.k = j10;
            } else {
                h6Var.k = 0L;
            }
            long j11 = wd1Var.K;
            if (j11 != 0) {
                h6Var.l = j11;
            } else {
                h6Var.l = 0L;
            }
            long j12 = wd1Var.L;
            if (j12 != 0) {
                h6Var.m = j12;
            } else {
                h6Var.m = 0L;
            }
            h6Var.n = wd1Var.O;
            if (i20 == 2) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                int B04 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                int i21 = (int) h6Var.k;
                int i22 = (int) h6Var.l;
                int i23 = (int) h6Var.m;
                int i24 = (int) h6Var.j;
                org.telegram.ui.Components.lq lqVar = wd1Var.V;
                if (i23 != 0) {
                    B04 = i23;
                }
                lqVar.e(B04, 3);
                org.telegram.ui.Components.lq lqVar2 = wd1Var.V;
                if (i22 != 0) {
                    B03 = i22;
                }
                lqVar2.e(B03, 2);
                org.telegram.ui.Components.lq lqVar3 = wd1Var.V;
                if (i21 != 0) {
                    B02 = i21;
                }
                i12 = 1;
                lqVar3.e(B02, 1);
                org.telegram.ui.Components.lq lqVar4 = wd1Var.V;
                if (i24 != 0) {
                    B0 = i24;
                }
                lqVar4.e(B0, 0);
                i13 = wd1Var.n;
                if (i13 != i12 || i13 == 3) {
                    i14 = wd1Var.y;
                    if (i14 == 0) {
                        h6Var.e = i14;
                        i15 = 0;
                    } else {
                        i15 = 0;
                        h6Var.e = 0;
                    }
                    i16 = wd1Var.E;
                    if (i16 == 0) {
                        h6Var.f = i16;
                    } else {
                        h6Var.f = i15;
                    }
                    i17 = wd1Var.F;
                    if (i17 == 0) {
                        h6Var.g = i17;
                    } else {
                        h6Var.g = i15;
                    }
                    i18 = wd1Var.G;
                    if (i18 == 0) {
                        h6Var.h = i18;
                    } else {
                        h6Var.h = i15;
                    }
                    if (i13 == 3) {
                        wd1Var.V.e(h6Var.h, 3);
                        wd1Var.V.e(h6Var.g, 2);
                        wd1Var.V.e(h6Var.f, 1);
                        org.telegram.ui.Components.lq lqVar5 = wd1Var.V;
                        int i25 = h6Var.e;
                        if (i25 == 0) {
                            i25 = h6Var.c;
                        }
                        z11 = false;
                        lqVar5.e(i25, 0);
                        org.telegram.ui.ActionBar.j6.n1(z11, z11);
                        wd1Var.u0.e1();
                    }
                }
                z11 = false;
                org.telegram.ui.ActionBar.j6.n1(z11, z11);
                wd1Var.u0.e1();
            }
        }
        i12 = 1;
        i13 = wd1Var.n;
        if (i13 != i12) {
        }
        i14 = wd1Var.y;
        if (i14 == 0) {
        }
        i16 = wd1Var.E;
        if (i16 == 0) {
        }
        i17 = wd1Var.F;
        if (i17 == 0) {
        }
        i18 = wd1Var.G;
        if (i18 == 0) {
        }
        if (i13 == 3) {
        }
        z11 = false;
        org.telegram.ui.ActionBar.j6.n1(z11, z11);
        wd1Var.u0.e1();
    }

    @Override // org.telegram.ui.Components.kq
    public final int M0(int i10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        wd1 wd1Var = this.a;
        if (wd1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.i6 i6Var = wd1Var.e0;
        if (i6Var.S && i10 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) i6Var.a0.get(org.telegram.ui.ActionBar.j6.n)) != null) {
            return h6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.kq
    public final void k(boolean z10) {
        int i10;
        int i11;
        wd1 wd1Var = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = wd1Var.s;
        if (!z10) {
            org.telegram.ui.Components.e5.W(wd1Var, 1, null, null);
            return;
        }
        if (h6Var.r == null) {
            wd1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.n2) wd1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(h6Var.b, h6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var.b, h6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.n2) wd1Var).currentAccount;
        sb2.append(MessagesController.getInstance(i10).linkPrefix);
        sb2.append("/addtheme/");
        sb2.append(h6Var.r.slug);
        String sb3 = sb2.toString();
        wd1Var.showDialog(new org.telegram.ui.Components.hq0(wd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.kq
    public final void z() {
        wd1 wd1Var = this.a;
        if (wd1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wd1Var.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new vl0(this, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        wd1Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(wd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }
}
