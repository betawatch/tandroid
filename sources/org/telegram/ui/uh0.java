package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class uh0 implements org.telegram.ui.Components.i90 {
    public final /* synthetic */ org.telegram.ui.Components.j90 a;
    public final /* synthetic */ vh0 b;

    public uh0(vh0 vh0Var, org.telegram.ui.Components.j90 j90Var) {
        this.b = vh0Var;
        this.a = j90Var;
    }

    @Override // org.telegram.ui.Components.i90
    public final void c() {
        wh0.U(this.b.d);
    }

    @Override // org.telegram.ui.Components.i90
    public final void h() {
        vh0 vh0Var = this.b;
        wh0 wh0Var = vh0Var.d;
        Context context = this.a.getContext();
        wh0 wh0Var2 = vh0Var.d;
        wh0Var.l0 = new org.telegram.ui.Components.f70(context, wh0Var2.e, wh0Var2.d, wh0Var2.k0, wh0Var2, wh0Var2.n, true, wh0Var2.h);
        vh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.i90
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.i90
    public final /* synthetic */ void i() {
    }
}
