package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class va1 implements View.OnClickListener {
    public final /* synthetic */ pb1 a;

    public va1(pb1 pb1Var) {
        this.a = pb1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pb1 pb1Var = this.a;
        if (pb1Var.M == 1) {
            org.telegram.ui.Components.s4.i0(pb1Var, -pb1Var.a, null, pb1Var.g(), null, false, pb1Var.J, new ra(this, 5), pb1Var.getResourceProvider());
            return;
        }
        pb1Var.getMessagesController().m(pb1Var.a, pb1Var.getUserConfig().f(), 0, null, pb1Var, false, new na1(pb1Var, 2), new oa1(pb1Var), null);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.I4, new Object[0]);
        pb1Var.R0(false);
    }
}
