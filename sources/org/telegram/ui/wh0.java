package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class wh0 implements org.telegram.ui.Components.v80 {
    public final /* synthetic */ org.telegram.ui.Components.w80 a;
    public final /* synthetic */ xh0 b;

    public wh0(xh0 xh0Var, org.telegram.ui.Components.w80 w80Var) {
        this.b = xh0Var;
        this.a = w80Var;
    }

    @Override // org.telegram.ui.Components.v80
    public final void c() {
        yh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.v80
    public final void d() {
        xh0 xh0Var = this.b;
        yh0 yh0Var = xh0Var.d;
        Context context = this.a.getContext();
        yh0 yh0Var2 = xh0Var.d;
        yh0Var.l0 = new org.telegram.ui.Components.r60(context, yh0Var2.e, yh0Var2.d, yh0Var2.k0, yh0Var2, yh0Var2.n, true, yh0Var2.h);
        xh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.v80
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.v80
    public final /* synthetic */ void j() {
    }
}
