package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class r60 extends org.telegram.ui.Components.g20 {
    public final /* synthetic */ z60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(z60 z60Var, Context context, int i10) {
        super(context, i10);
        this.r = z60Var;
    }

    @Override // org.telegram.ui.Components.g20
    public final void a(org.telegram.ui.Components.n30 n30Var) {
        super.a(n30Var);
        z60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.g20
    public final void b() {
        super.b();
        z60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.g20
    public final void c(org.telegram.ui.Components.n30 n30Var) {
        z60 z60Var = this.r;
        if (n30Var == z60Var.X) {
            z60Var.X = null;
        }
        if (n30Var == z60Var.Y) {
            z60Var.Y = null;
        }
        super.c(n30Var);
        z60.Z(z60Var);
    }
}
