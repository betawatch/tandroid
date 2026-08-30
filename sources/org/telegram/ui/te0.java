package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze0 b;

    public /* synthetic */ te0(ze0 ze0Var, int i10) {
        this.a = i10;
        this.b = ze0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                ze0 ze0Var = this.b;
                ze0Var.c(true);
                ze0Var.L.u1(0, true, null, true);
                ze0Var.o();
                break;
            case 1:
                ze0 ze0Var2 = this.b;
                ze0Var2.L.m0.popup = false;
                ze0Var2.h(null);
                break;
            case 2:
                ze0 ze0Var3 = this.b;
                ng0 ng0Var = ze0Var3.L;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.Q = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new te0(ze0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new te0(ze0Var3, 4));
                ng0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                ze0 ze0Var4 = this.b;
                ze0Var4.L.m0.popup = false;
                ze0Var4.h(null);
                break;
            default:
                ze0 ze0Var5 = this.b;
                ze0Var5.c(true);
                ze0Var5.L.u1(0, true, null, true);
                break;
        }
    }
}
