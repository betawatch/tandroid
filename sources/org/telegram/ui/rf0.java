package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ rf0(eg0 eg0Var, int i10) {
        this.a = i10;
        this.b = eg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ks[] ksVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        eg0 eg0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bk0 bk0Var = eg0Var.G;
                hs hsVar = eg0Var.f;
                int i13 = eg0Var.f0;
                if (i13 != 3 && (ksVarArr = hsVar.f) != null) {
                    for (int length = ksVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || hsVar.f[length].length() != 0) {
                            hsVar.f[length].requestFocus();
                            ks ksVar = hsVar.f[length];
                            ksVar.setSelection(ksVar.length());
                            bh0.T0(eg0Var.s0, hsVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yj0 yj0Var = eg0Var.a;
                if (yj0Var != null) {
                    yj0Var.start();
                }
                if (i13 == 15) {
                    bk0Var.getAnimatedDrawable().N(0, false, false);
                    bk0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new rf0(eg0Var, 6));
                break;
            case 2:
                ke0 ke0Var = eg0Var.w;
                eg0Var.q0 = false;
                while (true) {
                    ks[] ksVarArr2 = eg0Var.f.f;
                    if (i12 < ksVarArr2.length) {
                        ksVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (ke0Var.getCurrentView() != (eg0Var.f0 == 15 ? eg0Var.F : eg0Var.y)) {
                        ke0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new rf0(eg0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.bk0 bk0Var2 = eg0Var.s;
                bk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yj0 yj0Var2 = eg0Var.O;
                yj0Var2.N(0, false, false);
                yj0Var2.K(1);
                bk0Var2.setAnimation(yj0Var2);
                bk0Var2.d();
                break;
            case 5:
                try {
                    eg0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eg0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.yh.g(new StringBuilder("+"), eg0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                a2Var.setOnDismissListener(new ag0(eg0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.yj0 yj0Var3 = eg0Var.P;
                yj0Var3.t0 = new rf0(eg0Var, 8);
                org.telegram.ui.Components.bk0 bk0Var3 = eg0Var.s;
                bk0Var3.setAutoRepeat(false);
                yj0Var3.N(0, false, false);
                bk0Var3.setAnimation(yj0Var3);
                bk0Var3.d();
                break;
            case 7:
                eg0Var.postDelayed(new rf0(eg0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new rf0(eg0Var, 10));
                break;
            case 9:
                hs hsVar2 = eg0Var.f;
                hsVar2.e = false;
                hsVar2.f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr3 = hsVar2.f;
                    if (i12 >= ksVarArr3.length) {
                        break;
                    } else {
                        ksVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.bk0 bk0Var4 = eg0Var.s;
                bk0Var4.setAutoRepeat(false);
                bk0Var4.setAnimation(eg0Var.a);
                break;
        }
    }
}
