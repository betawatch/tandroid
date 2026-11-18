package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class za1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ bb1 a;

    public za1(bb1 bb1Var) {
        this.a = bb1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.s4 s4Var;
        bb1 bb1Var = this.a;
        if (i7 == -1) {
            if (bb1Var.H >= 0) {
                s4Var = ((org.telegram.ui.ActionBar.h2) bb1Var).parentLayout;
                if (s4Var.getFragmentStack().size() == 1) {
                    bb1Var.N0();
                    return;
                }
            }
            bb1Var.finishFragment();
            return;
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
            TL_account.Password password = bb1Var.V;
            String M0 = (password == null || !password.has_password) ? org.telegram.messenger.gd.M0(2131752567, null) : org.telegram.messenger.gd.M0(2131752575, null);
            String M02 = org.telegram.messenger.gd.M0(2131752574, null);
            String M03 = org.telegram.messenger.gd.M0(2131754950, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.U = M0;
            u1Var.S = M02;
            alertDialog$Builder.k(M03, new qi0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            bb1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
            }
        }
    }
}
