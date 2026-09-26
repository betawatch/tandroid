package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf0 b;

    public /* synthetic */ ve0(bf0 bf0Var, int i10) {
        this.a = i10;
        this.b = bf0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                bf0 bf0Var = this.b;
                bf0Var.c(true);
                bf0Var.O.u1(0, true, null, true);
                bf0Var.o();
                break;
            case 1:
                bf0 bf0Var2 = this.b;
                bf0Var2.O.p0.popup = false;
                bf0Var2.h(null);
                break;
            case 2:
                bf0 bf0Var3 = this.b;
                qg0 qg0Var = bf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ve0(bf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ve0(bf0Var3, 4));
                qg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                bf0 bf0Var4 = this.b;
                bf0Var4.O.p0.popup = false;
                bf0Var4.h(null);
                break;
            default:
                bf0 bf0Var5 = this.b;
                bf0Var5.c(true);
                bf0Var5.O.u1(0, true, null, true);
                break;
        }
    }
}
