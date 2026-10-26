package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z31 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c41 b;

    public /* synthetic */ z31(c41 c41Var, int i10) {
        this.a = i10;
        this.b = c41Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        c41 c41Var = this.b;
        c41Var.e = defaultWindowInsets;
        c41Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        c41Var.b.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.b.c0;
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                    break;
                }
                break;
            default:
                c41 c41Var = this.b;
                org.telegram.ui.ActionBar.e2 e2Var3 = c41Var.c0;
                if (e2Var3 != null) {
                    e2Var3.dismiss();
                    c41Var.c0 = null;
                }
                c41Var.dismiss();
                break;
        }
    }
}
