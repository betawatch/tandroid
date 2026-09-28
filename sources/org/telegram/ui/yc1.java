package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
