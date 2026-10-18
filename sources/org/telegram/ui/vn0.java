package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class vn0 {
    public final /* synthetic */ go0 a;

    public vn0(go0 go0Var) {
        this.a = go0Var;
    }

    public final void a(Exception exc) {
        go0 go0Var = this.a;
        if (go0Var.Q0) {
            return;
        }
        go0Var.H0(true, false);
        go0Var.D0(false);
        if ((exc instanceof vc.a) || (exc instanceof vc.b)) {
            org.telegram.ui.Components.f5.v0(go0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.f5.v0(go0Var, exc.getMessage());
        }
    }
}
