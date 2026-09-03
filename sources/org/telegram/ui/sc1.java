package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sc1 extends jd1 {
    public final /* synthetic */ xn h2;
    public final /* synthetic */ boolean i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc1(Object obj, xn xnVar, boolean z4) {
        super(obj, null, true);
        this.h2 = xnVar;
        this.i2 = z4;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        vn vnVar = this.h2.ba;
        vnVar.i(vnVar.f, vnVar.h, false, Boolean.valueOf(this.i2), false);
    }
}
