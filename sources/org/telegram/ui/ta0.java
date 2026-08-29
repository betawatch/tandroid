package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb0 b;

    public /* synthetic */ ta0(eb0 eb0Var, int i10) {
        this.a = i10;
        this.b = eb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eb0 eb0Var = this.b;
                eb0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(eb0Var.r.b);
                break;
            case 1:
                eb0 eb0Var2 = this.b;
                eb0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(eb0Var2.r.b);
                break;
            default:
                ye.d.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
