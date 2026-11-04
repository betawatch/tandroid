package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w61 implements d71 {
    public boolean a;
    public final /* synthetic */ wm b;

    public w61(wm wmVar, boolean z10) {
        this.b = wmVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.d71
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.d71
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.d71
    public final void l1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        um umVar = this.b.ya;
        umVar.r(umVar.f, umVar.g, z10, Boolean.valueOf(z11), false);
    }
}
