package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qn0 {
    public final /* synthetic */ bo0 a;

    public qn0(bo0 bo0Var) {
        this.a = bo0Var;
    }

    public final void a(Exception exc) {
        bo0 bo0Var = this.a;
        if (bo0Var.M0) {
            return;
        }
        bo0Var.H0(true, false);
        bo0Var.D0(false);
        if ((exc instanceof dc.a) || (exc instanceof dc.b)) {
            org.telegram.ui.Components.c5.w0(bo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.c5.w0(bo0Var, exc.getMessage());
        }
    }
}
