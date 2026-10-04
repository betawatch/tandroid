package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ta1 extends fa1 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.q61 y;

    public ta1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.fa1
    public final void b(ha1 ha1Var) {
        int i10;
        if (ha1Var == null || (i10 = this.x) < 0) {
            return;
        }
        ha1Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.fa1
    public final void c() {
    }

    @Override // org.telegram.ui.fa1
    public final void f() {
    }
}
