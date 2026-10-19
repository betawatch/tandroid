package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class se0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf0 b;

    public /* synthetic */ se0(hf0 hf0Var, int i10) {
        this.a = i10;
        this.b = hf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tr[] trVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        hf0 hf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.xj0 xj0Var = hf0Var.G;
                qr qrVar = hf0Var.f;
                int i13 = hf0Var.f0;
                if (i13 != 3 && (trVarArr = qrVar.f) != null) {
                    for (int length = trVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || qrVar.f[length].length() != 0) {
                            qrVar.f[length].requestFocus();
                            tr trVar = qrVar.f[length];
                            trVar.setSelection(trVar.length());
                            dg0.T0(hf0Var.s0, qrVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.uj0 uj0Var = hf0Var.a;
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
                AndroidUtilities.runOnUIThread(new se0(hf0Var, 6));
                break;
            case 2:
                ld0 ld0Var = hf0Var.w;
                hf0Var.q0 = false;
                while (true) {
                    tr[] trVarArr2 = hf0Var.f.f;
                    if (i12 < trVarArr2.length) {
                        trVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (ld0Var.getCurrentView() != (hf0Var.f0 == 15 ? hf0Var.F : hf0Var.y)) {
                        ld0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new se0(hf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.xj0 xj0Var2 = hf0Var.s;
                xj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.uj0 uj0Var2 = hf0Var.O;
                uj0Var2.N(0, false, false);
                uj0Var2.K(1);
                xj0Var2.setAnimation(uj0Var2);
                xj0Var2.d();
                break;
            case 5:
                try {
                    hf0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.kk.g(new StringBuilder("+"), hf0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new bf0(hf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.uj0 uj0Var3 = hf0Var.P;
                uj0Var3.t0 = new se0(hf0Var, 8);
                org.telegram.ui.Components.xj0 xj0Var3 = hf0Var.s;
                xj0Var3.setAutoRepeat(false);
                uj0Var3.N(0, false, false);
                xj0Var3.setAnimation(uj0Var3);
                xj0Var3.d();
                break;
            case 7:
                hf0Var.postDelayed(new se0(hf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new se0(hf0Var, 10));
                break;
            case 9:
                qr qrVar2 = hf0Var.f;
                qrVar2.e = false;
                qrVar2.f[0].requestFocus();
                while (true) {
                    tr[] trVarArr3 = qrVar2.f;
                    if (i12 >= trVarArr3.length) {
                        break;
                    } else {
                        trVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.xj0 xj0Var4 = hf0Var.s;
                xj0Var4.setAutoRepeat(false);
                xj0Var4.setAnimation(hf0Var.a);
                break;
        }
    }
}
