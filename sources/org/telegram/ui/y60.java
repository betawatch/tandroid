package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y60 extends org.telegram.ui.Components.f20 {
    public final /* synthetic */ g70 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y60(g70 g70Var, Context context, int i10) {
        super(context, i10);
        this.r = g70Var;
    }

    @Override // org.telegram.ui.Components.f20
    public final void a(org.telegram.ui.Components.m30 m30Var) {
        super.a(m30Var);
        g70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.f20
    public final void b() {
        super.b();
        g70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.f20
    public final void c(org.telegram.ui.Components.m30 m30Var) {
        g70 g70Var = this.r;
        if (m30Var == g70Var.X) {
            g70Var.X = null;
        }
        if (m30Var == g70Var.Y) {
            g70Var.Y = null;
        }
        super.c(m30Var);
        g70.Z(g70Var);
    }
}
