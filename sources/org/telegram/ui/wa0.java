package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb0 b;

    public /* synthetic */ wa0(gb0 gb0Var, int i10) {
        this.a = i10;
        this.b = gb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gb0 gb0Var = this.b;
                gb0Var.r.d.clearFocus();
                AndroidUtilities.hideKeyboard(gb0Var.r.d);
                break;
            case 1:
                pf.d.r(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
            default:
                gb0 gb0Var2 = this.b;
                gb0Var2.r.d.requestFocus();
                AndroidUtilities.showKeyboard(gb0Var2.r.d);
                break;
        }
    }
}
