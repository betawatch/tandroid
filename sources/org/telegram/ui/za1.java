package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class za1 extends la1 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.i61 y;

    public za1(Context context, int i10, int i11, ig.f fVar, int i12) {
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
