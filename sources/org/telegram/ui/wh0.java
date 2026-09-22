package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wh0 implements org.telegram.ui.Components.u80 {
    public final /* synthetic */ org.telegram.ui.Components.v80 a;
    public final /* synthetic */ xh0 b;

    public wh0(xh0 xh0Var, org.telegram.ui.Components.v80 v80Var) {
        this.b = xh0Var;
        this.a = v80Var;
    }

    @Override // org.telegram.ui.Components.u80
    public final void c() {
        yh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.u80
    public final void i() {
        xh0 xh0Var = this.b;
        yh0 yh0Var = xh0Var.d;
        Context context = this.a.getContext();
        yh0 yh0Var2 = xh0Var.d;
        yh0Var.l0 = new org.telegram.ui.Components.r60(context, yh0Var2.e, yh0Var2.d, yh0Var2.k0, yh0Var2, yh0Var2.n, true, yh0Var2.h);
        xh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.u80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.u80
    public final /* synthetic */ void j() {
    }
}
