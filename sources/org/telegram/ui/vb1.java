package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vb1 extends nc1 {
    public final /* synthetic */ rn g2;
    public final /* synthetic */ boolean h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb1(Object obj, rn rnVar, boolean z10) {
        super(obj, null, true);
        this.g2 = rnVar;
        this.h2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        pn pnVar = this.g2.aa;
        pnVar.i(pnVar.f, pnVar.h, false, Boolean.valueOf(this.h2), false);
    }
}
