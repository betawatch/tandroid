package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xh0 implements org.telegram.ui.Components.w90 {
    public final /* synthetic */ org.telegram.ui.Components.x90 a;
    public final /* synthetic */ yh0 b;

    public xh0(yh0 yh0Var, org.telegram.ui.Components.x90 x90Var) {
        this.b = yh0Var;
        this.a = x90Var;
    }

    @Override // org.telegram.ui.Components.w90
    public final void c() {
        zh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.w90
    public final void i() {
        yh0 yh0Var = this.b;
        zh0 zh0Var = yh0Var.d;
        Context context = this.a.getContext();
        zh0 zh0Var2 = yh0Var.d;
        zh0Var.l0 = new org.telegram.ui.Components.t70(context, zh0Var2.e, zh0Var2.d, zh0Var2.k0, zh0Var2, zh0Var2.n, true, zh0Var2.h);
        yh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.w90
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.w90
    public final /* synthetic */ void j() {
    }
}
