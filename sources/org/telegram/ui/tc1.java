package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tc1 implements ad1 {
    public boolean a;
    public final /* synthetic */ xn b;

    public tc1(xn xnVar, boolean z4) {
        this.b = xnVar;
        this.a = z4;
    }

    @Override // org.telegram.ui.ad1
    public final boolean T0() {
        return true;
    }

    @Override // org.telegram.ui.ad1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.ad1
    public final void l1(boolean z4) {
        boolean z10 = !this.a;
        this.a = z10;
        vn vnVar = this.b.ba;
        vnVar.i(vnVar.f, vnVar.h, z4, Boolean.valueOf(z10), false);
    }
}
