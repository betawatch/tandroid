package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class za1 extends la1 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.r51 y;

    public za1(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.la1
    public final void b(na1 na1Var) {
        int i10;
        if (na1Var == null || (i10 = this.x) < 0) {
            return;
        }
        na1Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.la1
    public final void c() {
    }

    @Override // org.telegram.ui.la1
    public final void f() {
    }
}
