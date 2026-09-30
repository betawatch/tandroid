package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class r60 extends org.telegram.ui.Components.i20 {
    public final /* synthetic */ z60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(z60 z60Var, Context context, int i10) {
        super(context, i10);
        this.r = z60Var;
    }

    @Override // org.telegram.ui.Components.i20
    public final void a(org.telegram.ui.Components.p30 p30Var) {
        super.a(p30Var);
        z60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.i20
    public final void b() {
        super.b();
        z60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.i20
    public final void c(org.telegram.ui.Components.p30 p30Var) {
        z60 z60Var = this.r;
        if (p30Var == z60Var.X) {
            z60Var.X = null;
        }
        if (p30Var == z60Var.Y) {
            z60Var.Y = null;
        }
        super.c(p30Var);
        z60.Z(z60Var);
    }
}
