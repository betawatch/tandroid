package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s60 extends org.telegram.ui.Components.h20 {
    public final /* synthetic */ a70 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(a70 a70Var, Context context, int i10) {
        super(context, i10);
        this.r = a70Var;
    }

    @Override // org.telegram.ui.Components.h20
    public final void a(org.telegram.ui.Components.o30 o30Var) {
        super.a(o30Var);
        a70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.h20
    public final void b() {
        super.b();
        a70.Z(this.r);
    }

    @Override // org.telegram.ui.Components.h20
    public final void c(org.telegram.ui.Components.o30 o30Var) {
        a70 a70Var = this.r;
        if (o30Var == a70Var.U) {
            a70Var.U = null;
        }
        if (o30Var == a70Var.V) {
            a70Var.V = null;
        }
        super.c(o30Var);
        a70.Z(a70Var);
    }
}
