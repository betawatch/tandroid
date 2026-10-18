package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
