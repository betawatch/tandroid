package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
