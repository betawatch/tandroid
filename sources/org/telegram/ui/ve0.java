package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;

    public /* synthetic */ ve0(jf0 jf0Var, int i9) {
        this.a = i9;
        this.b = jf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vr[] vrVarArr;
        int i9 = this.a;
        int i10 = 1;
        int i11 = 0;
        jf0 jf0Var = this.b;
        switch (i9) {
            case 0:
                org.telegram.ui.Components.pi0 pi0Var = jf0Var.C;
                sr srVar = jf0Var.f;
                int i12 = jf0Var.b0;
                if (i12 != 3 && (vrVarArr = srVar.f) != null) {
                    for (int length = vrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || srVar.f[length].length() != 0) {
                            srVar.f[length].requestFocus();
                            vr vrVar = srVar.f[length];
                            vrVar.setSelection(vrVar.length());
                            fg0.T0(jf0Var.o0, srVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.mi0 mi0Var = jf0Var.a;
                if (mi0Var != null) {
                    mi0Var.start();
                }
                if (i12 == 15) {
                    pi0Var.getAnimatedDrawable().L(0, false, false);
                    pi0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ve0(jf0Var, 6));
                break;
            case 2:
                od0 od0Var = jf0Var.w;
                jf0Var.m0 = false;
                while (true) {
                    vr[] vrVarArr2 = jf0Var.f.f;
                    if (i11 < vrVarArr2.length) {
                        vrVarArr2[i11].i(0.0f);
                        i11++;
                    } else if (od0Var.getCurrentView() != (jf0Var.b0 == 15 ? jf0Var.B : jf0Var.y)) {
                        od0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ve0(jf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.pi0 pi0Var2 = jf0Var.s;
                pi0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.mi0 mi0Var2 = jf0Var.K;
                mi0Var2.L(0, false, false);
                mi0Var2.I(1);
                pi0Var2.setAnimation(mi0Var2);
                pi0Var2.d();
                break;
            case 5:
                try {
                    jf0Var.o0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.ll.g(new StringBuilder("+"), jf0Var.d, ne.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                c2Var.setOnDismissListener(new ff0(jf0Var, i10));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.mi0 mi0Var3 = jf0Var.L;
                mi0Var3.q0 = new ve0(jf0Var, 8);
                org.telegram.ui.Components.pi0 pi0Var3 = jf0Var.s;
                pi0Var3.setAutoRepeat(false);
                mi0Var3.L(0, false, false);
                pi0Var3.setAnimation(mi0Var3);
                pi0Var3.d();
                break;
            case 7:
                jf0Var.postDelayed(new ve0(jf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ve0(jf0Var, 10));
                break;
            case 9:
                sr srVar2 = jf0Var.f;
                srVar2.e = false;
                srVar2.f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr3 = srVar2.f;
                    if (i11 >= vrVarArr3.length) {
                        break;
                    } else {
                        vrVarArr3[i11].i(0.0f);
                        i11++;
                    }
                }
            default:
                org.telegram.ui.Components.pi0 pi0Var4 = jf0Var.s;
                pi0Var4.setAutoRepeat(false);
                pi0Var4.setAnimation(jf0Var.a);
                break;
        }
    }
}
