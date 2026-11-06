package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class wa1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ya1 a;

    public wa1(ya1 ya1Var) {
        this.a = ya1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.q4 q4Var;
        ya1 ya1Var = this.a;
        if (i7 == -1) {
            if (ya1Var.G >= 0) {
                q4Var = ((org.telegram.ui.ActionBar.f2) ya1Var).parentLayout;
                if (q4Var.getFragmentStack().size() == 1) {
                    ya1Var.N0();
                    return;
                }
            }
            ya1Var.finishFragment();
            return;
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ya1Var.getParentActivity());
            TL_account.Password password = ya1Var.U;
            String M0 = (password == null || !password.has_password) ? org.telegram.messenger.hd.M0(2131752578, null) : org.telegram.messenger.hd.M0(2131752586, null);
            String M02 = org.telegram.messenger.hd.M0(2131752585, null);
            String M03 = org.telegram.messenger.hd.M0(2131754950, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.T = M0;
            u1Var.R = M02;
            alertDialog$Builder.k(M03, new li0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            ya1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
            }
        }
    }
}
