package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class un implements org.telegram.ui.Components.l70 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ bo b;

    public un(bo boVar, Context context) {
        this.b = boVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.l70
    public final void d() {
        this.b.d0(true);
    }

    @Override // org.telegram.ui.Components.l70
    public final void h() {
        bo boVar = this.b;
        org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(this.a, boVar.m0, boVar.Z, boVar.p0, boVar, boVar.a0, true, org.telegram.messenger.t3.T(boVar.Y));
        bo boVar2 = this.b;
        boVar2.q0 = i50Var;
        boVar2.q0.show();
    }

    @Override // org.telegram.ui.Components.l70
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.l70
    public final /* synthetic */ void i() {
    }
}
