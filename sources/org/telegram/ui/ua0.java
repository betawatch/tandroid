package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb0 b;

    public /* synthetic */ ua0(fb0 fb0Var, int i10) {
        this.a = i10;
        this.b = fb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fb0 fb0Var = this.b;
                fb0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(fb0Var.r.b);
                break;
            case 1:
                fb0 fb0Var2 = this.b;
                fb0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(fb0Var2.r.b);
                break;
            default:
                we.e.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
