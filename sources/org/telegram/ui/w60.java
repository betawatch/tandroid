package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
