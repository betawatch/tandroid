package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb0 b;

    public /* synthetic */ ra0(cb0 cb0Var, int i10) {
        this.a = i10;
        this.b = cb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cb0 cb0Var = this.b;
                cb0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(cb0Var.r.b);
                break;
            case 1:
                cb0 cb0Var2 = this.b;
                cb0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(cb0Var2.r.b);
                break;
            default:
                pf.d.r(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
