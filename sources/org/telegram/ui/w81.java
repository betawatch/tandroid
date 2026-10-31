package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w81 extends m91 {
    public final /* synthetic */ un l2;
    public final /* synthetic */ boolean m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w81(Object obj, un unVar, boolean z10) {
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
