package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
