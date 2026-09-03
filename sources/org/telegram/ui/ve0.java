package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf0 b;

    public /* synthetic */ ve0(bf0 bf0Var, int i10) {
        this.a = i10;
        this.b = bf0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                bf0 bf0Var = this.b;
                bf0Var.c(true);
                bf0Var.L.u1(0, true, null, true);
                bf0Var.o();
                break;
            case 1:
                bf0 bf0Var2 = this.b;
                bf0Var2.L.m0.popup = false;
                bf0Var2.h(null);
                break;
            case 2:
                bf0 bf0Var3 = this.b;
                pg0 pg0Var = bf0Var3.L;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pg0Var.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.a.Q = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ve0(bf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ve0(bf0Var3, 4));
                pg0Var.showDialog(alertDialog$Builder.a);
                break;
            case 3:
                bf0 bf0Var4 = this.b;
                bf0Var4.L.m0.popup = false;
                bf0Var4.h(null);
                break;
            default:
                bf0 bf0Var5 = this.b;
                bf0Var5.c(true);
                bf0Var5.L.u1(0, true, null, true);
                break;
        }
    }
}
