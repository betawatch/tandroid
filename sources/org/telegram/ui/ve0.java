package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ve0 implements org.telegram.ui.Components.l70 {
    public final /* synthetic */ org.telegram.ui.Components.m70 a;
    public final /* synthetic */ we0 b;

    public ve0(we0 we0Var, org.telegram.ui.Components.m70 m70Var) {
        this.b = we0Var;
        this.a = m70Var;
    }

    @Override // org.telegram.ui.Components.l70
    public final void d() {
        xe0.b0(this.b.d);
    }

    @Override // org.telegram.ui.Components.l70
    public final void h() {
        we0 we0Var = this.b;
        xe0 xe0Var = we0Var.d;
        Context context = this.a.getContext();
        xe0 xe0Var2 = we0Var.d;
        xe0Var.m0 = new org.telegram.ui.Components.i50(context, xe0Var2.e, xe0Var2.d, xe0Var2.l0, xe0Var2, xe0Var2.n, true, xe0Var2.h);
        we0Var.d.m0.show();
    }

    @Override // org.telegram.ui.Components.l70
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.l70
    public final /* synthetic */ void i() {
    }
}
