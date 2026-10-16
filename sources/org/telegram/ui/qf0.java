package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;

    public /* synthetic */ qf0(dg0 dg0Var, int i10) {
        this.a = i10;
        this.b = dg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ks[] ksVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        dg0 dg0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bk0 bk0Var = dg0Var.G;
                hs hsVar = dg0Var.f;
                int i13 = dg0Var.f0;
                if (i13 != 3 && (ksVarArr = hsVar.f) != null) {
                    for (int length = ksVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || hsVar.f[length].length() != 0) {
                            hsVar.f[length].requestFocus();
                            ks ksVar = hsVar.f[length];
                            ksVar.setSelection(ksVar.length());
                            ah0.T0(dg0Var.s0, hsVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yj0 yj0Var = dg0Var.a;
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
                AndroidUtilities.runOnUIThread(new qf0(dg0Var, 6));
                break;
            case 2:
                ie0 ie0Var = dg0Var.w;
                dg0Var.q0 = false;
                while (true) {
                    ks[] ksVarArr2 = dg0Var.f.f;
                    if (i12 < ksVarArr2.length) {
                        ksVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (ie0Var.getCurrentView() != (dg0Var.f0 == 15 ? dg0Var.F : dg0Var.y)) {
                        ie0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new qf0(dg0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.bk0 bk0Var2 = dg0Var.s;
                bk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yj0 yj0Var2 = dg0Var.O;
                yj0Var2.N(0, false, false);
                yj0Var2.K(1);
                bk0Var2.setAnimation(yj0Var2);
                bk0Var2.d();
                break;
            case 5:
                try {
                    dg0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.sk.g(new StringBuilder("+"), dg0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                a2Var.setOnDismissListener(new zf0(dg0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.yj0 yj0Var3 = dg0Var.P;
                yj0Var3.t0 = new qf0(dg0Var, 8);
                org.telegram.ui.Components.bk0 bk0Var3 = dg0Var.s;
                bk0Var3.setAutoRepeat(false);
                yj0Var3.N(0, false, false);
                bk0Var3.setAnimation(yj0Var3);
                bk0Var3.d();
                break;
            case 7:
                dg0Var.postDelayed(new qf0(dg0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new qf0(dg0Var, 10));
                break;
            case 9:
                hs hsVar2 = dg0Var.f;
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
                org.telegram.ui.Components.bk0 bk0Var4 = dg0Var.s;
                bk0Var4.setAutoRepeat(false);
                bk0Var4.setAnimation(dg0Var.a);
                break;
        }
    }
}
