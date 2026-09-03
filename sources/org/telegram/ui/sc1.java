package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sc1 extends jd1 {
    public final /* synthetic */ zn h2;
    public final /* synthetic */ boolean i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc1(Object obj, zn znVar, boolean z4) {
        super(obj, null, true);
        this.h2 = znVar;
        this.i2 = z4;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xn xnVar = this.h2.ba;
        xnVar.i(xnVar.f, xnVar.h, false, Boolean.valueOf(this.i2), false);
    }
}
