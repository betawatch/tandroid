package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yn0 {
    public final /* synthetic */ jo0 a;

    public yn0(jo0 jo0Var) {
        this.a = jo0Var;
    }

    public final void a(Exception exc) {
        jo0 jo0Var = this.a;
        if (jo0Var.N0) {
            return;
        }
        jo0Var.H0(true, false);
        jo0Var.D0(false);
        if ((exc instanceof fc.a) || (exc instanceof fc.b)) {
            org.telegram.ui.Components.z4.w0(jo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.z4.w0(jo0Var, exc.getMessage());
        }
    }
}
