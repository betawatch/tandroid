package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sn0 {
    public final /* synthetic */ do0 a;

    public sn0(do0 do0Var) {
        this.a = do0Var;
    }

    public final void a(Exception exc) {
        do0 do0Var = this.a;
        if (do0Var.M0) {
            return;
        }
        do0Var.H0(true, false);
        do0Var.D0(false);
        if ((exc instanceof cc.a) || (exc instanceof cc.b)) {
            org.telegram.ui.Components.y4.w0(do0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.y4.w0(do0Var, exc.getMessage());
        }
    }
}
