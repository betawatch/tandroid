package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w31 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z31 b;

    public /* synthetic */ w31(z31 z31Var, int i10) {
        this.a = i10;
        this.b = z31Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        z31 z31Var = this.b;
        z31Var.e = defaultWindowInsets;
        z31Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        z31Var.b.requestLayout();
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
                z31 z31Var = this.b;
                org.telegram.ui.ActionBar.b2 b2Var3 = z31Var.c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    z31Var.c0 = null;
                }
                z31Var.dismiss();
                break;
        }
    }
}
