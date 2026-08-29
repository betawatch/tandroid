package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ if0 b;

    public /* synthetic */ ue0(if0 if0Var, int i10) {
        this.a = i10;
        this.b = if0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ur[] urVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        if0 if0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.aj0 aj0Var = if0Var.C;
                sr srVar = if0Var.f;
                int i13 = if0Var.b0;
                if (i13 != 3 && (urVarArr = srVar.f) != null) {
                    for (int length = urVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || srVar.f[length].length() != 0) {
                            srVar.f[length].requestFocus();
                            ur urVar = srVar.f[length];
                            urVar.setSelection(urVar.length());
                            fg0.T0(if0Var.o0, srVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.xi0 xi0Var = if0Var.a;
                if (xi0Var != null) {
                    xi0Var.start();
                }
                if (i13 == 15) {
                    aj0Var.getAnimatedDrawable().L(0, false, false);
                    aj0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ue0(if0Var, 6));
                break;
            case 2:
                od0 od0Var = if0Var.w;
                if0Var.m0 = false;
                while (true) {
                    ur[] urVarArr2 = if0Var.f.f;
                    if (i12 < urVarArr2.length) {
                        urVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (od0Var.getCurrentView() != (if0Var.b0 == 15 ? if0Var.B : if0Var.y)) {
                        od0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ue0(if0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.aj0 aj0Var2 = if0Var.s;
                aj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.xi0 xi0Var2 = if0Var.K;
                xi0Var2.L(0, false, false);
                xi0Var2.I(1);
                aj0Var2.setAnimation(xi0Var2);
                aj0Var2.d();
                break;
            case 5:
                try {
                    if0Var.o0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(if0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.x3.k(new StringBuilder("+"), if0Var.d, qe.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                c2Var.setOnDismissListener(new df0(if0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.xi0 xi0Var3 = if0Var.L;
                xi0Var3.q0 = new ue0(if0Var, 8);
                org.telegram.ui.Components.aj0 aj0Var3 = if0Var.s;
                aj0Var3.setAutoRepeat(false);
                xi0Var3.L(0, false, false);
                aj0Var3.setAnimation(xi0Var3);
                aj0Var3.d();
                break;
            case 7:
                if0Var.postDelayed(new ue0(if0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ue0(if0Var, 10));
                break;
            case 9:
                sr srVar2 = if0Var.f;
                srVar2.e = false;
                srVar2.f[0].requestFocus();
                while (true) {
                    ur[] urVarArr3 = srVar2.f;
                    if (i12 >= urVarArr3.length) {
                        break;
                    } else {
                        urVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.aj0 aj0Var4 = if0Var.s;
                aj0Var4.setAutoRepeat(false);
                aj0Var4.setAnimation(if0Var.a);
                break;
        }
    }
}
