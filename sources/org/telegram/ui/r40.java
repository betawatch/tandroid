package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class r40 extends org.telegram.ui.Components.g10 {
    public final /* synthetic */ z40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(z40 z40Var, Context context, int i7) {
        super(context, i7);
        this.r = z40Var;
    }

    @Override // org.telegram.ui.Components.g10
    public final void a(org.telegram.ui.Components.m20 m20Var) {
        super.a(m20Var);
        z40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.g10
    public final void b() {
        super.b();
        z40.e0(this.r);
    }

    @Override // org.telegram.ui.Components.g10
    public final void c(org.telegram.ui.Components.m20 m20Var) {
        z40 z40Var = this.r;
        if (m20Var == z40Var.Y) {
            z40Var.Y = null;
        }
        if (m20Var == z40Var.Z) {
            z40Var.Z = null;
        }
        super.c(m20Var);
        z40.e0(z40Var);
    }
}
