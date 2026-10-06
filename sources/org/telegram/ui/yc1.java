package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class yc1 extends pd1 {
    public final /* synthetic */ yn k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc1(Object obj, yn ynVar, boolean z10) {
        super(obj, null, true);
        this.k2 = ynVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        wn wnVar = this.k2.ca;
        wnVar.i(wnVar.f, wnVar.h, false, Boolean.valueOf(this.l2), false);
    }
}
