package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zn implements org.telegram.ui.Components.s70 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ho b;

    public zn(ho hoVar, Context context) {
        this.b = hoVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.s70
    public final void e() {
        this.b.d0(true);
    }

    @Override // org.telegram.ui.Components.s70
    public final void f() {
        ho hoVar = this.b;
        org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(this.a, hoVar.m0, hoVar.Z, hoVar.p0, hoVar, hoVar.a0, true, org.telegram.messenger.t3.T(hoVar.Y));
        ho hoVar2 = this.b;
        hoVar2.q0 = p50Var;
        hoVar2.q0.show();
    }

    @Override // org.telegram.ui.Components.s70
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.s70
    public final /* synthetic */ void j() {
    }
}
