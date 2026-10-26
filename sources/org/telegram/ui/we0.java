package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;

    public /* synthetic */ we0(jf0 jf0Var, int i10) {
        this.a = i10;
        this.b = jf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xr[] xrVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        jf0 jf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.ak0 ak0Var = jf0Var.G;
                vr vrVar = jf0Var.f;
                int i13 = jf0Var.h0;
                if (i13 != 3 && (xrVarArr = vrVar.f) != null) {
                    for (int length = xrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || vrVar.f[length].length() != 0) {
                            vrVar.f[length].requestFocus();
                            xr xrVar = vrVar.f[length];
                            xrVar.setSelection(xrVar.length());
                            gg0.W0(jf0Var.u0, vrVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.xj0 xj0Var = jf0Var.a;
                if (xj0Var != null) {
                    xj0Var.start();
                }
                if (i13 == 15) {
                    ak0Var.getAnimatedDrawable().N(0, false, false);
                    ak0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new we0(jf0Var, 6));
                break;
            case 2:
                nd0 nd0Var = jf0Var.w;
                jf0Var.s0 = false;
                while (true) {
                    xr[] xrVarArr2 = jf0Var.f.f;
                    if (i12 < xrVarArr2.length) {
                        xrVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (nd0Var.getCurrentView() != (jf0Var.h0 == 15 ? jf0Var.F : jf0Var.y)) {
                        nd0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new we0(jf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.ak0 ak0Var2 = jf0Var.s;
                ak0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.xj0 xj0Var2 = jf0Var.Q;
                xj0Var2.N(0, false, false);
                xj0Var2.K(1);
                ak0Var2.setAnimation(xj0Var2);
                ak0Var2.d();
                break;
            case 5:
                try {
                    jf0Var.u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                e2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.vh.g(new StringBuilder("+"), jf0Var.d, kf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                e2Var.setOnDismissListener(new ff0(jf0Var, i11));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.xj0 xj0Var3 = jf0Var.R;
                xj0Var3.t0 = new we0(jf0Var, 8);
                org.telegram.ui.Components.ak0 ak0Var3 = jf0Var.s;
                ak0Var3.setAutoRepeat(false);
                xj0Var3.N(0, false, false);
                ak0Var3.setAnimation(xj0Var3);
                ak0Var3.d();
                break;
            case 7:
                jf0Var.postDelayed(new we0(jf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new we0(jf0Var, 10));
                break;
            case 9:
                vr vrVar2 = jf0Var.f;
                vrVar2.e = false;
                vrVar2.f[0].requestFocus();
                while (true) {
                    xr[] xrVarArr3 = vrVar2.f;
                    if (i12 >= xrVarArr3.length) {
                        break;
                    } else {
                        xrVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.ak0 ak0Var4 = jf0Var.s;
                ak0Var4.setAutoRepeat(false);
                ak0Var4.setAnimation(jf0Var.a);
                break;
        }
    }
}
