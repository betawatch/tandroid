package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class r60 extends org.telegram.ui.Components.h20 {
    public final /* synthetic */ z60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(z60 z60Var, Context context, int i10) {
        super(context, i10);
        this.r = z60Var;
    }

    @Override // org.telegram.ui.Components.h20
    public final void a(org.telegram.ui.Components.p30 p30Var) {
        super.a(p30Var);
        z60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.h20
    public final void b() {
        super.b();
        z60.Z(this.r);
    }

    @Override // org.telegram.ui.Components.h20
    public final void c(org.telegram.ui.Components.p30 p30Var) {
        z60 z60Var = this.r;
        if (p30Var == z60Var.U) {
            z60Var.U = null;
        }
        if (p30Var == z60Var.V) {
            z60Var.V = null;
        }
        super.c(p30Var);
        z60.Z(z60Var);
    }
}
