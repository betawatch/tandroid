package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class un0 {
    public final /* synthetic */ fo0 a;

    public un0(fo0 fo0Var) {
        this.a = fo0Var;
    }

    public final void a(Exception exc) {
        fo0 fo0Var = this.a;
        if (fo0Var.Q0) {
            return;
        }
        fo0Var.H0(true, false);
        fo0Var.D0(false);
        if ((exc instanceof vc.a) || (exc instanceof vc.b)) {
            org.telegram.ui.Components.f5.v0(fo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.f5.v0(fo0Var, exc.getMessage());
        }
    }
}
