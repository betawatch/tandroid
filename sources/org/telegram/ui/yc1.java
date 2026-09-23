package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class yc1 implements fd1 {
    public boolean a;
    public final /* synthetic */ xn b;

    public yc1(xn xnVar, boolean z10) {
        this.b = xnVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.fd1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.fd1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.fd1
    public final void o1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        vn vnVar = this.b.ea;
        vnVar.i(vnVar.f, vnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
