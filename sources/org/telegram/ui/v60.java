package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class v60 extends org.telegram.ui.Components.j20 {
    public final /* synthetic */ d70 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v60(d70 d70Var, Context context, int i10) {
        super(context, i10);
        this.r = d70Var;
    }

    @Override // org.telegram.ui.Components.j20
    public final void a(org.telegram.ui.Components.q30 q30Var) {
        super.a(q30Var);
        d70.Y(this.r);
    }

    @Override // org.telegram.ui.Components.j20
    public final void b() {
        super.b();
        d70.Y(this.r);
    }

    @Override // org.telegram.ui.Components.j20
    public final void c(org.telegram.ui.Components.q30 q30Var) {
        d70 d70Var = this.r;
        if (q30Var == d70Var.X) {
            d70Var.X = null;
        }
        if (q30Var == d70Var.Y) {
            d70Var.Y = null;
        }
        super.c(q30Var);
        d70.Y(d70Var);
    }
}
