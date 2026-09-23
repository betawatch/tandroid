package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xc1 extends od1 {
    public final /* synthetic */ xn k2;
    public final /* synthetic */ boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc1(Object obj, xn xnVar, boolean z10) {
        super(obj, null, true);
        this.k2 = xnVar;
        this.l2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        vn vnVar = this.k2.ea;
        vnVar.i(vnVar.f, vnVar.h, false, Boolean.valueOf(this.l2), false);
    }
}
