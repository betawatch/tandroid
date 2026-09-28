package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class xc1 extends od1 {
    public final /* synthetic */ wn k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc1(Object obj, wn wnVar, boolean z10) {
        super(obj, null, true);
        this.k2 = wnVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        un unVar = this.k2.ea;
        unVar.i(unVar.f, unVar.h, false, Boolean.valueOf(this.l2), false);
    }
}
