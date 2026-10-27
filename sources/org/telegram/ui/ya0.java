package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb0 b;

    public /* synthetic */ ya0(fb0 fb0Var, int i10) {
        this.a = i10;
        this.b = fb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qf.d.r(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
            case 1:
                fb0 fb0Var = this.b;
                fb0Var.r.d.requestFocus();
                AndroidUtilities.showKeyboard(fb0Var.r.d);
                break;
            default:
                fb0 fb0Var2 = this.b;
                fb0Var2.r.d.clearFocus();
                AndroidUtilities.hideKeyboard(fb0Var2.r.d);
                break;
        }
    }
}
