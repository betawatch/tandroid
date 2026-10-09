package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u60 extends org.telegram.ui.Components.w20 {
    public final /* synthetic */ c70 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u60(c70 c70Var, Context context, int i10) {
        super(context, i10);
        this.r = c70Var;
    }

    @Override // org.telegram.ui.Components.w20
    public final void a(org.telegram.ui.Components.d40 d40Var) {
        super.a(d40Var);
        c70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.w20
    public final void b() {
        super.b();
        c70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.w20
    public final void c(org.telegram.ui.Components.d40 d40Var) {
        c70 c70Var = this.r;
        if (d40Var == c70Var.X) {
            c70Var.X = null;
        }
        if (d40Var == c70Var.Y) {
            c70Var.Y = null;
        }
        super.c(d40Var);
        c70.Z(c70Var);
    }
}
