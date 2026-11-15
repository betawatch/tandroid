package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class va1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ xa1 a;

    public va1(xa1 xa1Var) {
        this.a = xa1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.o4 o4Var;
        xa1 xa1Var = this.a;
        if (i7 == -1) {
            if (xa1Var.H >= 0) {
                o4Var = ((org.telegram.ui.ActionBar.e2) xa1Var).parentLayout;
                if (o4Var.getFragmentStack().size() == 1) {
                    xa1Var.N0();
                    return;
                }
            }
            xa1Var.finishFragment();
            return;
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
            TL_account.Password password = xa1Var.V;
            String M0 = (password == null || !password.has_password) ? org.telegram.messenger.hd.M0(2131752578, null) : org.telegram.messenger.hd.M0(2131752586, null);
            String M02 = org.telegram.messenger.hd.M0(2131752585, null);
            String M03 = org.telegram.messenger.hd.M0(2131754950, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.U = M0;
            t1Var.S = M02;
            alertDialog$Builder.k(M03, new ni0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            xa1Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
            }
        }
    }
}
