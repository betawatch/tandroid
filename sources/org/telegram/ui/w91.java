package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w91 extends i91 {
    public final int v;
    public final int w;
    public int x;
    public rh y;

    public w91(Context context, int i10, int i11, kg.g gVar, int i12) {
        super(context, i11, gVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.i91
    public final void b(k91 k91Var) {
        int i10;
        if (k91Var == null || (i10 = this.x) < 0) {
            return;
        }
        k91Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.i91
    public final void c() {
    }

    @Override // org.telegram.ui.i91
    public final void f() {
    }
}
