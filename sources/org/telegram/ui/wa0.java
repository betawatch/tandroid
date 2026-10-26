package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ db0 b;

    public /* synthetic */ wa0(db0 db0Var, int i10) {
        this.a = i10;
        this.b = db0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qf.d.r(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
            case 1:
                db0 db0Var = this.b;
                db0Var.r.d.requestFocus();
                AndroidUtilities.showKeyboard(db0Var.r.d);
                break;
            default:
                db0 db0Var2 = this.b;
                db0Var2.r.d.clearFocus();
                AndroidUtilities.hideKeyboard(db0Var2.r.d);
                break;
        }
    }
}
