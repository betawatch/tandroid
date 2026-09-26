package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class yc1 implements fd1 {
    public boolean a;
    public final /* synthetic */ wn b;

    public yc1(wn wnVar, boolean z10) {
        this.b = wnVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.fd1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.fd1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.fd1
    public final void o1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        un unVar = this.b.ea;
        unVar.i(unVar.f, unVar.h, z10, Boolean.valueOf(z11), false);
    }
}
