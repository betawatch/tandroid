package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ro0 {
    public final /* synthetic */ cp0 a;

    public ro0(cp0 cp0Var) {
        this.a = cp0Var;
    }

    public final void a(Exception exc) {
        cp0 cp0Var = this.a;
        if (cp0Var.Q0) {
            return;
        }
        cp0Var.H0(true, false);
        cp0Var.D0(false);
        if ((exc instanceof vc.a) || (exc instanceof vc.b)) {
            org.telegram.ui.Components.g5.v0(cp0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.g5.v0(cp0Var, exc.getMessage());
        }
    }
}
