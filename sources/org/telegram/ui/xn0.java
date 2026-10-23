package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
