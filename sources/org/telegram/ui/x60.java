package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
