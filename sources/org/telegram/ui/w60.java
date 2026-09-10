package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class w60 extends org.telegram.ui.Components.o20 {
    public final /* synthetic */ e70 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(e70 e70Var, Context context, int i10) {
        super(context, i10);
        this.r = e70Var;
    }

    @Override // org.telegram.ui.Components.o20
    public final void a(org.telegram.ui.Components.w30 w30Var) {
        super.a(w30Var);
        e70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.o20
    public final void b() {
        super.b();
        e70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.o20
    public final void c(org.telegram.ui.Components.w30 w30Var) {
        e70 e70Var = this.r;
        if (w30Var == e70Var.X) {
            e70Var.X = null;
        }
        if (w30Var == e70Var.Y) {
            e70Var.Y = null;
        }
        super.c(w30Var);
        e70.Z(e70Var);
    }
}
