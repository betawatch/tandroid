package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ug1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ wg1 a;

    public ug1(wg1 wg1Var) {
        this.a = wg1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        wg1 wg1Var = this.a;
        if (i10 == -1) {
            if (wg1Var.D >= 0) {
                e5Var = ((org.telegram.ui.ActionBar.p2) wg1Var).parentLayout;
                if (e5Var.getFragmentStack().size() == 1) {
                    wg1Var.I0();
                    return;
                }
            }
            wg1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
            TL_account.Password password = wg1Var.R;
            String string = (password == null || !password.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.Q = string;
            d2Var.O = string2;
            alertDialog$Builder.k(string3, new kl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
            wg1Var.showDialog(d2Var2);
            TextView textView = (TextView) d2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
            }
        }
    }
}
