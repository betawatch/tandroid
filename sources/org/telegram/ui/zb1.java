package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class zb1 extends qc1 {
    public final /* synthetic */ sn l2;
    public final /* synthetic */ boolean m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb1(Object obj, sn snVar, boolean z10) {
        super(obj, null, true);
        this.l2 = snVar;
        this.m2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        qn qnVar = this.l2.qa;
        qnVar.q(qnVar.f, qnVar.g, false, Boolean.valueOf(this.m2), false);
    }
}
