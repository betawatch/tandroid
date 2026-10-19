package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class tb1 extends kc1 {
    public final /* synthetic */ qn k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb1(Object obj, qn qnVar, boolean z10) {
        super(obj, null, true);
        this.k2 = qnVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        on onVar = this.k2.ea;
        onVar.k(onVar.f, onVar.h, false, Boolean.valueOf(this.l2), false);
    }
}
