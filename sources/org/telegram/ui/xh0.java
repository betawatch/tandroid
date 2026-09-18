package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class xh0 implements org.telegram.ui.Components.d90 {
    public final /* synthetic */ org.telegram.ui.Components.e90 a;
    public final /* synthetic */ yh0 b;

    public xh0(yh0 yh0Var, org.telegram.ui.Components.e90 e90Var) {
        this.b = yh0Var;
        this.a = e90Var;
    }

    @Override // org.telegram.ui.Components.d90
    public final void e() {
        zh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.d90
    public final void j() {
        yh0 yh0Var = this.b;
        zh0 zh0Var = yh0Var.d;
        Context context = this.a.getContext();
        zh0 zh0Var2 = yh0Var.d;
        zh0Var.l0 = new org.telegram.ui.Components.a70(context, zh0Var2.e, zh0Var2.d, zh0Var2.k0, zh0Var2, zh0Var2.n, true, zh0Var2.h);
        yh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.d90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.d90
    public final /* synthetic */ void k() {
    }
}
