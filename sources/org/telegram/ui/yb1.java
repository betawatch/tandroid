package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yb1 extends qc1 {
    public final /* synthetic */ tn g2;
    public final /* synthetic */ boolean h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb1(Object obj, tn tnVar, boolean z10) {
        super(obj, null, true);
        this.g2 = tnVar;
        this.h2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        rn rnVar = this.g2.aa;
        rnVar.i(rnVar.f, rnVar.h, false, Boolean.valueOf(this.h2), false);
    }
}
