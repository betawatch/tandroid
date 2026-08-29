package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zb1 implements hc1 {
    public boolean a;
    public final /* synthetic */ tn b;

    public zb1(tn tnVar, boolean z10) {
        this.b = tnVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.hc1
    public final boolean U0() {
        return true;
    }

    @Override // org.telegram.ui.hc1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.hc1
    public final void j1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        rn rnVar = this.b.aa;
        rnVar.i(rnVar.f, rnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
