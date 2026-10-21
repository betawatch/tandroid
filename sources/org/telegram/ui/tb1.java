package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
