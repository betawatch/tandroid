package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class u31 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x31 b;

    public /* synthetic */ u31(x31 x31Var, int i10) {
        this.a = i10;
        this.b = x31Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        x31 x31Var = this.b;
        x31Var.e = defaultWindowInsets;
        x31Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        x31Var.b.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.b.c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    break;
                }
                break;
            default:
                x31 x31Var = this.b;
                org.telegram.ui.ActionBar.b2 b2Var3 = x31Var.c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    x31Var.c0 = null;
                }
                x31Var.dismiss();
                break;
        }
    }
}
