package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
