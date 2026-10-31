package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rc1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ tc1 a;

    public rc1(tc1 tc1Var) {
        this.a = tc1Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        tc1 tc1Var = this.a;
        if (i10 == -1) {
            if (tc1Var.G >= 0) {
                z4Var = ((org.telegram.ui.ActionBar.k2) tc1Var).parentLayout;
                if (z4Var.getFragmentStack().size() == 1) {
                    tc1Var.M0();
                    return;
                }
            }
            tc1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
            TL_account.Password password = tc1Var.U;
            String L0 = (password == null || !password.has_password) ? org.telegram.messenger.cd.L0(2131752578, null) : org.telegram.messenger.cd.L0(2131752586, null);
            String L02 = org.telegram.messenger.cd.L0(2131752585, null);
            String L03 = org.telegram.messenger.cd.L0(2131754950, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.T = L0;
            x1Var.R = L02;
            alertDialog$Builder.k(L03, new tj0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            tc1Var.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
            }
        }
    }
}
