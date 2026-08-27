package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mf0 b;

    public /* synthetic */ ye0(mf0 mf0Var, int i10) {
        this.a = i10;
        this.b = mf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wr[] wrVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        mf0 mf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.ri0 ri0Var = mf0Var.C;
                ur urVar = mf0Var.f;
                int i13 = mf0Var.b0;
                if (i13 != 3 && (wrVarArr = urVar.f) != null) {
                    for (int length = wrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || urVar.f[length].length() != 0) {
                            urVar.f[length].requestFocus();
                            wr wrVar = urVar.f[length];
                            wrVar.setSelection(wrVar.length());
                            ig0.T0(mf0Var.o0, urVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.oi0 oi0Var = mf0Var.a;
                if (oi0Var != null) {
                    oi0Var.start();
                }
                if (i13 == 15) {
                    ri0Var.getAnimatedDrawable().L(0, false, false);
                    ri0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ye0(mf0Var, 6));
                break;
            case 2:
                rd0 rd0Var = mf0Var.w;
                mf0Var.m0 = false;
                while (true) {
                    wr[] wrVarArr2 = mf0Var.f.f;
                    if (i12 < wrVarArr2.length) {
                        wrVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (rd0Var.getCurrentView() != (mf0Var.b0 == 15 ? mf0Var.B : mf0Var.y)) {
                        rd0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ye0(mf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.ri0 ri0Var2 = mf0Var.s;
                ri0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.oi0 oi0Var2 = mf0Var.K;
                oi0Var2.L(0, false, false);
                oi0Var2.I(1);
                ri0Var2.setAnimation(oi0Var2);
                ri0Var2.d();
                break;
            case 5:
                try {
                    mf0Var.o0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.N = string;
                b2Var.P = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.y1.k(new StringBuilder("+"), mf0Var.d, oe.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new if0(mf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.oi0 oi0Var3 = mf0Var.L;
                oi0Var3.q0 = new ye0(mf0Var, 8);
                org.telegram.ui.Components.ri0 ri0Var3 = mf0Var.s;
                ri0Var3.setAutoRepeat(false);
                oi0Var3.L(0, false, false);
                ri0Var3.setAnimation(oi0Var3);
                ri0Var3.d();
                break;
            case 7:
                mf0Var.postDelayed(new ye0(mf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ye0(mf0Var, 10));
                break;
            case 9:
                ur urVar2 = mf0Var.f;
                urVar2.e = false;
                urVar2.f[0].requestFocus();
                while (true) {
                    wr[] wrVarArr3 = urVar2.f;
                    if (i12 >= wrVarArr3.length) {
                        break;
                    } else {
                        wrVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.ri0 ri0Var4 = mf0Var.s;
                ri0Var4.setAutoRepeat(false);
                ri0Var4.setAnimation(mf0Var.a);
                break;
        }
    }
}
