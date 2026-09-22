package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xa1 extends ja1 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.s51 y;

    public xa1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.ja1
    public final void b(la1 la1Var) {
        int i10;
        if (la1Var == null || (i10 = this.x) < 0) {
            return;
        }
        la1Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.ja1
    public final void c() {
    }

    @Override // org.telegram.ui.ja1
    public final void f() {
    }
}
