package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class zc1 implements gd1 {
    public boolean a;
    public final /* synthetic */ yn b;

    public zc1(yn ynVar, boolean z10) {
        this.b = ynVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.gd1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.gd1
    public final boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.gd1
    public final void q1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        wn wnVar = this.b.ca;
        wnVar.i(wnVar.f, wnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
