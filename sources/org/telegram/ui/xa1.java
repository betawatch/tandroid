package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class xa1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ za1 a;

    public xa1(za1 za1Var) {
        this.a = za1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.q4 q4Var;
        za1 za1Var = this.a;
        if (i7 == -1) {
            if (za1Var.G >= 0) {
                q4Var = ((org.telegram.ui.ActionBar.f2) za1Var).parentLayout;
                if (q4Var.getFragmentStack().size() == 1) {
                    za1Var.N0();
                    return;
                }
            }
            za1Var.finishFragment();
            return;
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
            TL_account.Password password = za1Var.U;
            String M0 = (password == null || !password.has_password) ? org.telegram.messenger.id.M0(2131752578, null) : org.telegram.messenger.id.M0(2131752586, null);
            String M02 = org.telegram.messenger.id.M0(2131752585, null);
            String M03 = org.telegram.messenger.id.M0(2131754950, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.T = M0;
            u1Var.R = M02;
            alertDialog$Builder.k(M03, new li0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            za1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
            }
        }
    }
}
