package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wb1 implements ec1 {
    public boolean a;
    public final /* synthetic */ rn b;

    public wb1(rn rnVar, boolean z10) {
        this.b = rnVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.ec1
    public final boolean X0() {
        return true;
    }

    @Override // org.telegram.ui.ec1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.ec1
    public final void n1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        pn pnVar = this.b.aa;
        pnVar.i(pnVar.f, pnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
