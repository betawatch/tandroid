package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mf0 b;

    public /* synthetic */ ze0(mf0 mf0Var, int i10) {
        this.a = i10;
        this.b = mf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vr[] vrVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        mf0 mf0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bk0 bk0Var = mf0Var.G;
                sr srVar = mf0Var.f;
                int i13 = mf0Var.h0;
                if (i13 != 3 && (vrVarArr = srVar.f) != null) {
                    for (int length = vrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || srVar.f[length].length() != 0) {
                            srVar.f[length].requestFocus();
                            vr vrVar = srVar.f[length];
                            vrVar.setSelection(vrVar.length());
                            ig0.V0(mf0Var.u0, srVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yj0 yj0Var = mf0Var.a;
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
                AndroidUtilities.runOnUIThread(new ze0(mf0Var, 6));
                break;
            case 2:
                qd0 qd0Var = mf0Var.w;
                mf0Var.s0 = false;
                while (true) {
                    vr[] vrVarArr2 = mf0Var.f.f;
                    if (i12 < vrVarArr2.length) {
                        vrVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (qd0Var.getCurrentView() != (mf0Var.h0 == 15 ? mf0Var.F : mf0Var.y)) {
                        qd0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ze0(mf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.bk0 bk0Var2 = mf0Var.s;
                bk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yj0 yj0Var2 = mf0Var.Q;
                yj0Var2.N(0, false, false);
                yj0Var2.K(1);
                bk0Var2.setAnimation(yj0Var2);
                bk0Var2.d();
                break;
            case 5:
                try {
                    mf0Var.u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                c2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.sl.h(new StringBuilder("+"), mf0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                c2Var.setOnDismissListener(new hf0(mf0Var, i11));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.yj0 yj0Var3 = mf0Var.R;
                yj0Var3.t0 = new ze0(mf0Var, 8);
                org.telegram.ui.Components.bk0 bk0Var3 = mf0Var.s;
                bk0Var3.setAutoRepeat(false);
                yj0Var3.N(0, false, false);
                bk0Var3.setAnimation(yj0Var3);
                bk0Var3.d();
                break;
            case 7:
                mf0Var.postDelayed(new ze0(mf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ze0(mf0Var, 10));
                break;
            case 9:
                sr srVar2 = mf0Var.f;
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
                org.telegram.ui.Components.bk0 bk0Var4 = mf0Var.s;
                bk0Var4.setAutoRepeat(false);
                bk0Var4.setAnimation(mf0Var.a);
                break;
        }
    }
}
