package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rh0 implements org.telegram.ui.Components.v80 {
    public final /* synthetic */ org.telegram.ui.Components.w80 a;
    public final /* synthetic */ sh0 b;

    public rh0(sh0 sh0Var, org.telegram.ui.Components.w80 w80Var) {
        this.b = sh0Var;
        this.a = w80Var;
    }

    @Override // org.telegram.ui.Components.v80
    public final void c() {
        th0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.v80
    public final void i() {
        sh0 sh0Var = this.b;
        th0 th0Var = sh0Var.d;
        Context context = this.a.getContext();
        th0 th0Var2 = sh0Var.d;
        th0Var.l0 = new org.telegram.ui.Components.s60(context, th0Var2.e, th0Var2.d, th0Var2.k0, th0Var2, th0Var2.n, true, th0Var2.h);
        sh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.v80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.v80
    public final /* synthetic */ void j() {
    }
}
