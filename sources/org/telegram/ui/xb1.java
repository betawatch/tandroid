package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xb1 extends oc1 {
    public final /* synthetic */ qn g2;
    public final /* synthetic */ boolean h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb1(Object obj, qn qnVar, boolean z10) {
        super(obj, null, true);
        this.g2 = qnVar;
        this.h2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        on onVar = this.g2.aa;
        onVar.i(onVar.f, onVar.h, false, Boolean.valueOf(this.h2), false);
    }
}
