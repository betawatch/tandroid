package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tc1 implements ad1 {
    public boolean a;
    public final /* synthetic */ zn b;

    public tc1(zn znVar, boolean z4) {
        this.b = znVar;
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
        xn xnVar = this.b.ba;
        xnVar.i(xnVar.f, xnVar.h, z4, Boolean.valueOf(z10), false);
    }
}
