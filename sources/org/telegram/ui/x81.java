package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x81 implements e91 {
    public boolean a;
    public final /* synthetic */ un b;

    public x81(un unVar, boolean z10) {
        this.b = unVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.e91
    public final void M1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        sn snVar = this.b.xa;
        snVar.r(snVar.f, snVar.g, z10, Boolean.valueOf(z11), false);
    }

    @Override // org.telegram.ui.e91
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.e91
    public final boolean b1() {
        return true;
    }
}
