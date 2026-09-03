package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ af0 b;

    public /* synthetic */ te0(af0 af0Var, int i10) {
        this.a = i10;
        this.b = af0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                af0 af0Var = this.b;
                af0Var.c(true);
                af0Var.L.u1(0, true, null, true);
                af0Var.o();
                break;
            case 1:
                af0 af0Var2 = this.b;
                af0Var2.L.m0.popup = false;
                af0Var2.h(null);
                break;
            case 2:
                af0 af0Var3 = this.b;
                og0 og0Var = af0Var3.L;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.Q = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new te0(af0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new te0(af0Var3, 4));
                og0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                af0 af0Var4 = this.b;
                af0Var4.L.m0.popup = false;
                af0Var4.h(null);
                break;
            default:
                af0 af0Var5 = this.b;
                af0Var5.c(true);
                af0Var5.L.u1(0, true, null, true);
                break;
        }
    }
}
