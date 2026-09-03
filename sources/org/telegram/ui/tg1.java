package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tg1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ vg1 a;

    public tg1(vg1 vg1Var) {
        this.a = vg1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        vg1 vg1Var = this.a;
        if (i10 == -1) {
            if (vg1Var.D >= 0) {
                f5Var = ((org.telegram.ui.ActionBar.p2) vg1Var).parentLayout;
                if (f5Var.getFragmentStack().size() == 1) {
                    vg1Var.I0();
                    return;
                }
            }
            vg1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
            TL_account.Password password = vg1Var.R;
            String string = (password == null || !password.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.Q = string;
            d2Var.O = string2;
            alertDialog$Builder.k(string3, new kl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
            vg1Var.showDialog(d2Var2);
            TextView textView = (TextView) d2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
            }
        }
    }
}
