package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class x41 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a51 b;

    public /* synthetic */ x41(a51 a51Var, int i10) {
        this.a = i10;
        this.b = a51Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        a51 a51Var = this.b;
        a51Var.e = defaultWindowInsets;
        a51Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        a51Var.b.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.b.c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    break;
                }
                break;
            default:
                a51 a51Var = this.b;
                org.telegram.ui.ActionBar.b2 b2Var3 = a51Var.c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    a51Var.c0 = null;
                }
                a51Var.dismiss();
                break;
        }
    }
}
