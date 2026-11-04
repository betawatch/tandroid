package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v61 extends l71 {
    public final /* synthetic */ wm m2;
    public final /* synthetic */ boolean n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v61(Object obj, wm wmVar, boolean z10) {
        super(obj, null, true);
        this.m2 = wmVar;
        this.n2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        um umVar = this.m2.ya;
        umVar.r(umVar.f, umVar.g, false, Boolean.valueOf(this.n2), false);
    }
}
