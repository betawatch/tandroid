package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class yh0 implements org.telegram.ui.Components.c90 {
    public final /* synthetic */ org.telegram.ui.Components.d90 a;
    public final /* synthetic */ zh0 b;

    public yh0(zh0 zh0Var, org.telegram.ui.Components.d90 d90Var) {
        this.b = zh0Var;
        this.a = d90Var;
    }

    @Override // org.telegram.ui.Components.c90
    public final void e() {
        ai0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.c90
    public final void h() {
        zh0 zh0Var = this.b;
        ai0 ai0Var = zh0Var.d;
        Context context = this.a.getContext();
        ai0 ai0Var2 = zh0Var.d;
        ai0Var.l0 = new org.telegram.ui.Components.z60(context, ai0Var2.e, ai0Var2.d, ai0Var2.k0, ai0Var2, ai0Var2.n, true, ai0Var2.h);
        zh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.c90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.c90
    public final /* synthetic */ void i() {
    }
}
