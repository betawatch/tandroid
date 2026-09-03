package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t41 implements r0.o, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w41 b;

    public /* synthetic */ t41(w41 w41Var, int i10) {
        this.a = i10;
        this.b = w41Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        w41 w41Var = this.b;
        w41Var.e = defaultWindowInsets;
        w41Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        w41Var.b.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.b.Z;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    break;
                }
                break;
            default:
                w41 w41Var = this.b;
                org.telegram.ui.ActionBar.d2 d2Var3 = w41Var.Z;
                if (d2Var3 != null) {
                    d2Var3.dismiss();
                    w41Var.Z = null;
                }
                w41Var.dismiss();
                break;
        }
    }
}
