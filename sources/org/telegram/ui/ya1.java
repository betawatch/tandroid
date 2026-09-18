package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ya1 extends ka1 {
    public final int v;
    public final int w;
    public int x;
    public org.telegram.ui.Components.t51 y;

    public ya1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.w = i12;
    }

    @Override // org.telegram.ui.ka1
    public final void b(ma1 ma1Var) {
        int i10;
        if (ma1Var == null || (i10 = this.x) < 0) {
            return;
        }
        ma1Var.a(this.v, this.w, i10, this.y);
    }

    @Override // org.telegram.ui.ka1
    public final void c() {
    }

    @Override // org.telegram.ui.ka1
    public final void f() {
    }
}
