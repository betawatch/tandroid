package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
