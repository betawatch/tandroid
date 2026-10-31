package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vo implements org.telegram.ui.Components.i80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ cp b;

    public vo(cp cpVar, Context context) {
        this.b = cpVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.i80
    public final void d() {
        this.b.c0(true);
    }

    @Override // org.telegram.ui.Components.i80
    public final void g() {
        cp cpVar = this.b;
        org.telegram.ui.Components.c60 c60Var = new org.telegram.ui.Components.c60(this.a, cpVar.l0, cpVar.Y, cpVar.o0, cpVar, cpVar.Z, true, org.telegram.messenger.w3.T(cpVar.X));
        cp cpVar2 = this.b;
        cpVar2.p0 = c60Var;
        cpVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.i80
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.i80
    public final /* synthetic */ void n() {
    }
}
