package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class s91 extends e91 {
    public final int v;
    public final int w;
    public int x;
    public oh y;

    public s91(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.e91
    public final void b(g91 g91Var) {
        int i10;
        if (g91Var == null || (i10 = this.x) < 0) {
            return;
        }
        g91Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.e91
    public final void c() {
    }

    @Override // org.telegram.ui.e91
    public final void f() {
    }
}
