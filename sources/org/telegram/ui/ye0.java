package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf0 b;

    public /* synthetic */ ye0(lf0 lf0Var, int i10) {
        this.a = i10;
        this.b = lf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zr[] zrVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        lf0 lf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bk0 bk0Var = lf0Var.G;
                xr xrVar = lf0Var.f;
                int i13 = lf0Var.h0;
                if (i13 != 3 && (zrVarArr = xrVar.f) != null) {
                    for (int length = zrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || xrVar.f[length].length() != 0) {
                            xrVar.f[length].requestFocus();
                            zr zrVar = xrVar.f[length];
                            zrVar.setSelection(zrVar.length());
                            ig0.W0(lf0Var.u0, xrVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yj0 yj0Var = lf0Var.a;
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
                AndroidUtilities.runOnUIThread(new ye0(lf0Var, 6));
                break;
            case 2:
                pd0 pd0Var = lf0Var.w;
                lf0Var.s0 = false;
                while (true) {
                    zr[] zrVarArr2 = lf0Var.f.f;
                    if (i12 < zrVarArr2.length) {
                        zrVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (pd0Var.getCurrentView() != (lf0Var.h0 == 15 ? lf0Var.F : lf0Var.y)) {
                        pd0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ye0(lf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.bk0 bk0Var2 = lf0Var.s;
                bk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yj0 yj0Var2 = lf0Var.Q;
                yj0Var2.N(0, false, false);
                yj0Var2.K(1);
                bk0Var2.setAnimation(yj0Var2);
                bk0Var2.d();
                break;
            case 5:
                try {
                    lf0Var.u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                e2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.wh.g(new StringBuilder("+"), lf0Var.d, kf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                e2Var.setOnDismissListener(new hf0(lf0Var, i11));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.yj0 yj0Var3 = lf0Var.R;
                yj0Var3.t0 = new ye0(lf0Var, 8);
                org.telegram.ui.Components.bk0 bk0Var3 = lf0Var.s;
                bk0Var3.setAutoRepeat(false);
                yj0Var3.N(0, false, false);
                bk0Var3.setAnimation(yj0Var3);
                bk0Var3.d();
                break;
            case 7:
                lf0Var.postDelayed(new ye0(lf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ye0(lf0Var, 10));
                break;
            case 9:
                xr xrVar2 = lf0Var.f;
                xrVar2.e = false;
                xrVar2.f[0].requestFocus();
                while (true) {
                    zr[] zrVarArr3 = xrVar2.f;
                    if (i12 >= zrVarArr3.length) {
                        break;
                    } else {
                        zrVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.bk0 bk0Var4 = lf0Var.s;
                bk0Var4.setAutoRepeat(false);
                bk0Var4.setAnimation(lf0Var.a);
                break;
        }
    }
}
