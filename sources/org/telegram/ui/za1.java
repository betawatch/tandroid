package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class za1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ bb1 a;

    public za1(bb1 bb1Var) {
        this.a = bb1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.q4 q4Var;
        bb1 bb1Var = this.a;
        if (i7 == -1) {
            if (bb1Var.G >= 0) {
                q4Var = ((org.telegram.ui.ActionBar.f2) bb1Var).parentLayout;
                if (q4Var.getFragmentStack().size() == 1) {
                    bb1Var.N0();
                    return;
                }
            }
            bb1Var.finishFragment();
            return;
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
            TL_account.Password password = bb1Var.U;
            String M0 = (password == null || !password.has_password) ? org.telegram.messenger.id.M0(2131752578, null) : org.telegram.messenger.id.M0(2131752586, null);
            String M02 = org.telegram.messenger.id.M0(2131752585, null);
            String M03 = org.telegram.messenger.id.M0(2131754950, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.T = M0;
            u1Var.R = M02;
            alertDialog$Builder.k(M03, new ni0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            bb1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
            }
        }
    }
}
