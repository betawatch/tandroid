package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ra1 extends da1 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.s61 y;

    public ra1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.da1
    public final void b(fa1 fa1Var) {
        int i10;
        if (fa1Var == null || (i10 = this.x) < 0) {
            return;
        }
        fa1Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.da1
    public final void c() {
    }

    @Override // org.telegram.ui.da1
    public final void f() {
    }
}
