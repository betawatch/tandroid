package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t81 implements View.OnClickListener {
    public final /* synthetic */ m91 a;

    public t81(m91 m91Var) {
        this.a = m91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m91 m91Var = this.a;
        if (m91Var.N == 1) {
            org.telegram.ui.Components.t4.i0(m91Var, -m91Var.a, null, m91Var.g(), null, false, m91Var.K, new ma(this, 4), m91Var.getResourceProvider());
            return;
        }
        m91Var.getMessagesController().m(m91Var.a, m91Var.getUserConfig().f(), 0, null, m91Var, false, new n81(m91Var, 2), new o81(m91Var), null);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.I4, new Object[0]);
        m91Var.S0(false);
    }
}
