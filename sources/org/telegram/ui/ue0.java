package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;

    public /* synthetic */ ue0(jf0 jf0Var, int i10) {
        this.a = i10;
        this.b = jf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vr[] vrVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        jf0 jf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.xj0 xj0Var = jf0Var.G;
                sr srVar = jf0Var.f;
                int i13 = jf0Var.f0;
                if (i13 != 3 && (vrVarArr = srVar.f) != null) {
                    for (int length = vrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || srVar.f[length].length() != 0) {
                            srVar.f[length].requestFocus();
                            vr vrVar = srVar.f[length];
                            vrVar.setSelection(vrVar.length());
                            fg0.T0(jf0Var.s0, srVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.uj0 uj0Var = jf0Var.a;
                if (uj0Var != null) {
                    uj0Var.start();
                }
                if (i13 == 15) {
                    xj0Var.getAnimatedDrawable().N(0, false, false);
                    xj0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ue0(jf0Var, 6));
                break;
            case 2:
                nd0 nd0Var = jf0Var.w;
                jf0Var.q0 = false;
                while (true) {
                    vr[] vrVarArr2 = jf0Var.f.f;
                    if (i12 < vrVarArr2.length) {
                        vrVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (nd0Var.getCurrentView() != (jf0Var.f0 == 15 ? jf0Var.F : jf0Var.y)) {
                        nd0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ue0(jf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.xj0 xj0Var2 = jf0Var.s;
                xj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.uj0 uj0Var2 = jf0Var.O;
                uj0Var2.N(0, false, false);
                uj0Var2.K(1);
                xj0Var2.setAnimation(uj0Var2);
                xj0Var2.d();
                break;
            case 5:
                try {
                    jf0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.kk.g(new StringBuilder("+"), jf0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new df0(jf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.uj0 uj0Var3 = jf0Var.P;
                uj0Var3.t0 = new ue0(jf0Var, 8);
                org.telegram.ui.Components.xj0 xj0Var3 = jf0Var.s;
                xj0Var3.setAutoRepeat(false);
                uj0Var3.N(0, false, false);
                xj0Var3.setAnimation(uj0Var3);
                xj0Var3.d();
                break;
            case 7:
                jf0Var.postDelayed(new ue0(jf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ue0(jf0Var, 10));
                break;
            case 9:
                sr srVar2 = jf0Var.f;
                srVar2.e = false;
                srVar2.f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr3 = srVar2.f;
                    if (i12 >= vrVarArr3.length) {
                        break;
                    } else {
                        vrVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.xj0 xj0Var4 = jf0Var.s;
                xj0Var4.setAutoRepeat(false);
                xj0Var4.setAnimation(jf0Var.a);
                break;
        }
    }
}
