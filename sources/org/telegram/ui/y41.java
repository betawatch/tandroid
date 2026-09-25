package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y41 implements r0.n, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b51 b;

    public /* synthetic */ y41(b51 b51Var, int i10) {
        this.a = i10;
        this.b = b51Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        b51 b51Var = this.b;
        b51Var.e = defaultWindowInsets;
        b51Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        b51Var.b.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.b.c0;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    break;
                }
                break;
            default:
                b51 b51Var = this.b;
                org.telegram.ui.ActionBar.a2 a2Var3 = b51Var.c0;
                if (a2Var3 != null) {
                    a2Var3.dismiss();
                    b51Var.c0 = null;
                }
                b51Var.dismiss();
                break;
        }
    }
}
