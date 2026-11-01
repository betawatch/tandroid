package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v81 implements c91 {
    public boolean a;
    public final /* synthetic */ un b;

    public v81(un unVar, boolean z10) {
        this.b = unVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.c91
    public final void M1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        sn snVar = this.b.xa;
        snVar.r(snVar.f, snVar.g, z10, Boolean.valueOf(z11), false);
    }

    @Override // org.telegram.ui.c91
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.c91
    public final boolean b1() {
        return true;
    }
}
