package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class yh0 implements org.telegram.ui.Components.f90 {
    public final /* synthetic */ org.telegram.ui.Components.g90 a;
    public final /* synthetic */ zh0 b;

    public yh0(zh0 zh0Var, org.telegram.ui.Components.g90 g90Var) {
        this.b = zh0Var;
        this.a = g90Var;
    }

    @Override // org.telegram.ui.Components.f90
    public final void c() {
        ai0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.f90
    public final void h() {
        zh0 zh0Var = this.b;
        ai0 ai0Var = zh0Var.d;
        Context context = this.a.getContext();
        ai0 ai0Var2 = zh0Var.d;
        ai0Var.l0 = new org.telegram.ui.Components.c70(context, ai0Var2.e, ai0Var2.d, ai0Var2.k0, ai0Var2, ai0Var2.n, true, ai0Var2.h);
        zh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.f90
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.f90
    public final /* synthetic */ void i() {
    }
}
