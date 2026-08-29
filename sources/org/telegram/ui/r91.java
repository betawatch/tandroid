package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r91 extends d91 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.g51 y;

    public r91(Context context, int i10, int i11, tf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.d91
    public final void b(f91 f91Var) {
        int i10;
        if (f91Var == null || (i10 = this.x) < 0) {
            return;
        }
        f91Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.d91
    public final void c() {
    }

    @Override // org.telegram.ui.d91
    public final void f() {
    }
}
