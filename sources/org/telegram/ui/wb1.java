package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class wb1 implements dc1 {
    public boolean a;
    public final /* synthetic */ sn b;

    public wb1(sn snVar, boolean z10) {
        this.b = snVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.dc1
    public final boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.dc1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.dc1
    public final void c1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        qn qnVar = this.b.ea;
        qnVar.k(qnVar.f, qnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
