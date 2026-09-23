package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class t60 extends org.telegram.ui.Components.g20 {
    public final /* synthetic */ b70 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(b70 b70Var, Context context, int i10) {
        super(context, i10);
        this.r = b70Var;
    }

    @Override // org.telegram.ui.Components.g20
    public final void a(org.telegram.ui.Components.n30 n30Var) {
        super.a(n30Var);
        b70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.g20
    public final void b() {
        super.b();
        b70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.g20
    public final void c(org.telegram.ui.Components.n30 n30Var) {
        b70 b70Var = this.r;
        if (n30Var == b70Var.X) {
            b70Var.X = null;
        }
        if (n30Var == b70Var.Y) {
            b70Var.Y = null;
        }
        super.c(n30Var);
        b70.Z(b70Var);
    }
}
