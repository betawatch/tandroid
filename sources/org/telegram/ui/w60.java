package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class w60 extends org.telegram.ui.Components.f20 {
    public final /* synthetic */ e70 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(e70 e70Var, Context context, int i10) {
        super(context, i10);
        this.r = e70Var;
    }

    @Override // org.telegram.ui.Components.f20
    public final void a(org.telegram.ui.Components.m30 m30Var) {
        super.a(m30Var);
        e70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.f20
    public final void b() {
        super.b();
        e70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.f20
    public final void c(org.telegram.ui.Components.m30 m30Var) {
        e70 e70Var = this.r;
        if (m30Var == e70Var.X) {
            e70Var.X = null;
        }
        if (m30Var == e70Var.Y) {
            e70Var.Y = null;
        }
        super.c(m30Var);
        e70.Z(e70Var);
    }
}
