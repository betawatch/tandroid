package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x41 extends j41 {
    public eh E;
    public final int w;
    public final int x;
    public int y;

    public x41(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.w = i7;
        this.x = i11;
    }

    @Override // org.telegram.ui.j41
    public final void b(l41 l41Var) {
        int i7;
        if (l41Var == null || (i7 = this.y) < 0) {
            return;
        }
        l41Var.a(this.w, this.x, i7, this.E);
    }

    @Override // org.telegram.ui.j41
    public final void c() {
    }

    @Override // org.telegram.ui.j41
    public final void f() {
    }
}
