package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
