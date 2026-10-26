package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u91 extends g91 {
    public final int v;
    public final int w;
    public int x;
    public qh y;

    public u91(Context context, int i10, int i11, kg.g gVar, int i12) {
        super(context, i11, gVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.g91
    public final void b(i91 i91Var) {
        int i10;
        if (i91Var == null || (i10 = this.x) < 0) {
            return;
        }
        i91Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.g91
    public final void c() {
    }

    @Override // org.telegram.ui.g91
    public final void f() {
    }
}
