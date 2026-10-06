package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
