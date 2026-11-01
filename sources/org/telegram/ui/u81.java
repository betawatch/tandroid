package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u81 extends k91 {
    public final /* synthetic */ un l2;
    public final /* synthetic */ boolean m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u81(Object obj, un unVar, boolean z10) {
        super(obj, null, true);
        this.l2 = unVar;
        this.m2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        sn snVar = this.l2.xa;
        snVar.r(snVar.f, snVar.g, false, Boolean.valueOf(this.m2), false);
    }
}
