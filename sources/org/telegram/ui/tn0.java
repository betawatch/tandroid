package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class tn0 {
    public final /* synthetic */ eo0 a;

    public tn0(eo0 eo0Var) {
        this.a = eo0Var;
    }

    public final void a(Exception exc) {
        eo0 eo0Var = this.a;
        if (eo0Var.Q0) {
            return;
        }
        eo0Var.H0(true, false);
        eo0Var.D0(false);
        if ((exc instanceof vc.a) || (exc instanceof vc.b)) {
            org.telegram.ui.Components.f5.v0(eo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.f5.v0(eo0Var, exc.getMessage());
        }
    }
}
