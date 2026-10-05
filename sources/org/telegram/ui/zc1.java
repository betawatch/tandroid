package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zc1 implements gd1 {
    public boolean a;
    public final /* synthetic */ yn b;

    public zc1(yn ynVar, boolean z10) {
        this.b = ynVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.gd1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.gd1
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.gd1
    public final void q1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        wn wnVar = this.b.ca;
        wnVar.i(wnVar.f, wnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
