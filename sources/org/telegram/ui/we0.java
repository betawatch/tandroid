package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class we0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf0 b;

    public /* synthetic */ we0(cf0 cf0Var, int i10) {
        this.a = i10;
        this.b = cf0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                cf0 cf0Var = this.b;
                cf0Var.c(true);
                cf0Var.O.u1(0, true, null, true);
                cf0Var.o();
                break;
            case 1:
                cf0 cf0Var2 = this.b;
                cf0Var2.O.p0.popup = false;
                cf0Var2.h(null);
                break;
            case 2:
                cf0 cf0Var3 = this.b;
                rg0 rg0Var = cf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new we0(cf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new we0(cf0Var3, 4));
                rg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                cf0 cf0Var4 = this.b;
                cf0Var4.O.p0.popup = false;
                cf0Var4.h(null);
                break;
            default:
                cf0 cf0Var5 = this.b;
                cf0Var5.c(true);
                cf0Var5.O.u1(0, true, null, true);
                break;
        }
    }
}
