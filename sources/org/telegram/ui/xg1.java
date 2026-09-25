package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class xg1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ zg1 a;

    public xg1(zg1 zg1Var) {
        this.a = zg1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        zg1 zg1Var = this.a;
        if (i10 == -1) {
            if (zg1Var.G >= 0) {
                b5Var = ((org.telegram.ui.ActionBar.m2) zg1Var).parentLayout;
                if (b5Var.getFragmentStack().size() == 1) {
                    zg1Var.I0();
                    return;
                }
            }
            zg1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zg1Var.getParentActivity());
            TL_account.Password password = zg1Var.U;
            String string = (password == null || !password.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.T = string;
            a2Var.R = string2;
            alertDialog$Builder.k(string3, new ml0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
            zg1Var.showDialog(a2Var2);
            TextView textView = (TextView) a2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
            }
        }
    }
}
