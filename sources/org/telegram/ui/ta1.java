package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ta1 implements View.OnClickListener {
    public final /* synthetic */ nb1 a;

    public ta1(nb1 nb1Var) {
        this.a = nb1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nb1 nb1Var = this.a;
        if (nb1Var.M == 1) {
            org.telegram.ui.Components.s4.i0(nb1Var, -nb1Var.a, null, nb1Var.g(), null, false, nb1Var.J, new ra(this, 5), nb1Var.getResourceProvider());
            return;
        }
        nb1Var.getMessagesController().m(nb1Var.a, nb1Var.getUserConfig().f(), 0, null, nb1Var, false, new la1(nb1Var, 2), new ma1(nb1Var), null);
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.I4, new Object[0]);
        nb1Var.S0(false);
    }
}
