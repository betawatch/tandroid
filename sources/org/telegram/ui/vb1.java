package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class vb1 extends mc1 {
    public final /* synthetic */ sn k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb1(Object obj, sn snVar, boolean z10) {
        super(obj, null, true);
        this.k2 = snVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        qn qnVar = this.k2.ea;
        qnVar.k(qnVar.f, qnVar.h, false, Boolean.valueOf(this.l2), false);
    }
}
