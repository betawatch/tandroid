package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s61 extends e61 {
    public uh D;
    public final int w;
    public final int x;
    public int y;

    public s61(Context context, int i10, int i11, bg.h hVar, int i12) {
        super(context, i11, hVar, null);
        this.w = i10;
        this.x = i12;
    }

    @Override // org.telegram.ui.e61
    public final void b(g61 g61Var) {
        int i10;
        if (g61Var == null || (i10 = this.y) < 0) {
            return;
        }
        g61Var.a(this.w, this.x, i10, this.D);
    }

    @Override // org.telegram.ui.e61
    public final void c() {
    }

    @Override // org.telegram.ui.e61
    public final void f() {
    }
}
