package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class y31 implements r0.n, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b41 b;

    public /* synthetic */ y31(b41 b41Var, int i10) {
        this.a = i10;
        this.b = b41Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        b41 b41Var = this.b;
        b41Var.e = defaultWindowInsets;
        b41Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        b41Var.b.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.b.c0;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    break;
                }
                break;
            default:
                b41 b41Var = this.b;
                org.telegram.ui.ActionBar.c2 c2Var3 = b41Var.c0;
                if (c2Var3 != null) {
                    c2Var3.dismiss();
                    b41Var.c0 = null;
                }
                b41Var.dismiss();
                break;
        }
    }
}
