package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class yh0 implements org.telegram.ui.Components.u80 {
    public final /* synthetic */ org.telegram.ui.Components.v80 a;
    public final /* synthetic */ zh0 b;

    public yh0(zh0 zh0Var, org.telegram.ui.Components.v80 v80Var) {
        this.b = zh0Var;
        this.a = v80Var;
    }

    @Override // org.telegram.ui.Components.u80
    public final void c() {
        ai0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.u80
    public final void i() {
        zh0 zh0Var = this.b;
        ai0 ai0Var = zh0Var.d;
        Context context = this.a.getContext();
        ai0 ai0Var2 = zh0Var.d;
        ai0Var.l0 = new org.telegram.ui.Components.r60(context, ai0Var2.e, ai0Var2.d, ai0Var2.k0, ai0Var2, ai0Var2.n, true, ai0Var2.h);
        zh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.u80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.u80
    public final /* synthetic */ void j() {
    }
}
