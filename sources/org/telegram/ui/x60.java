package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class x60 extends org.telegram.ui.Components.f20 {
    public final /* synthetic */ f70 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x60(f70 f70Var, Context context, int i10) {
        super(context, i10);
        this.r = f70Var;
    }

    @Override // org.telegram.ui.Components.f20
    public final void a(org.telegram.ui.Components.m30 m30Var) {
        super.a(m30Var);
        f70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.f20
    public final void b() {
        super.b();
        f70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.f20
    public final void c(org.telegram.ui.Components.m30 m30Var) {
        f70 f70Var = this.r;
        if (m30Var == f70Var.X) {
            f70Var.X = null;
        }
        if (m30Var == f70Var.Y) {
            f70Var.Y = null;
        }
        super.c(m30Var);
        f70.Z(f70Var);
    }
}
