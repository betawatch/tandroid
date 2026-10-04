package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff0 b;

    public /* synthetic */ ze0(ff0 ff0Var, int i10) {
        this.a = i10;
        this.b = ff0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ff0 ff0Var = this.b;
                ff0Var.c(true);
                ff0Var.O.u1(0, true, null, true);
                ff0Var.o();
                break;
            case 1:
                ff0 ff0Var2 = this.b;
                ff0Var2.O.p0.popup = false;
                ff0Var2.h(null);
                break;
            case 2:
                ff0 ff0Var3 = this.b;
                ug0 ug0Var = ff0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ug0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ze0(ff0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ze0(ff0Var3, 4));
                ug0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                ff0 ff0Var4 = this.b;
                ff0Var4.O.p0.popup = false;
                ff0Var4.h(null);
                break;
            default:
                ff0 ff0Var5 = this.b;
                ff0Var5.c(true);
                ff0Var5.O.u1(0, true, null, true);
                break;
        }
    }
}
