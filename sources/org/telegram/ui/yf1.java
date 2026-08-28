package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yf1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ag1 a;

    public yf1(ag1 ag1Var) {
        this.a = ag1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        org.telegram.ui.ActionBar.b5 b5Var;
        ag1 ag1Var = this.a;
        if (i9 == -1) {
            if (ag1Var.C >= 0) {
                b5Var = ((org.telegram.ui.ActionBar.o2) ag1Var).parentLayout;
                if (b5Var.getFragmentStack().size() == 1) {
                    ag1Var.H0();
                    return;
                }
            }
            ag1Var.finishFragment();
            return;
        }
        if (i9 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
            TL_account.Password password = ag1Var.Q;
            String string = (password == null || !password.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.P = string;
            c2Var.N = string2;
            alertDialog$Builder.k(string3, new dl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
            ag1Var.showDialog(c2Var2);
            TextView textView = (TextView) c2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
            }
        }
    }
}
