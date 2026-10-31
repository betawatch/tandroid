package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y41 extends org.telegram.ui.Components.z41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.z41.h(new y41());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        ((z41) view).set(a51Var.z);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean c(org.telegram.ui.Components.a51 a51Var, org.telegram.ui.Components.a51 a51Var2) {
        return a51Var.z == a51Var2.z;
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new z41(context, p6Var);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(org.telegram.ui.Components.a51 a51Var, org.telegram.ui.Components.a51 a51Var2) {
        return a51Var.d == a51Var2.d;
    }
}
