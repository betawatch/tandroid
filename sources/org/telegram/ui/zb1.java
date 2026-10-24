package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
