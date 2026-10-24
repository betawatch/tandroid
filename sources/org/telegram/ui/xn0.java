package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xn0 {
    public final /* synthetic */ io0 a;

    public xn0(io0 io0Var) {
        this.a = io0Var;
    }

    public final void a(Exception exc) {
        io0 io0Var = this.a;
        if (io0Var.Q0) {
            return;
        }
        io0Var.H0(true, false);
        io0Var.D0(false);
        if ((exc instanceof vc.a) || (exc instanceof vc.b)) {
            org.telegram.ui.Components.f5.w0(io0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.f5.w0(io0Var, exc.getMessage());
        }
    }
}
