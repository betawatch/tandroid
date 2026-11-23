package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z41 extends l41 {
    public fh E;
    public final int w;
    public final int x;
    public int y;

    public z41(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.w = i7;
        this.x = i11;
    }

    @Override // org.telegram.ui.l41
    public final void b(n41 n41Var) {
        int i7;
        if (n41Var == null || (i7 = this.y) < 0) {
            return;
        }
        n41Var.a(this.w, this.x, i7, this.E);
    }

    @Override // org.telegram.ui.l41
    public final void c() {
    }

    @Override // org.telegram.ui.l41
    public final void f() {
    }
}
