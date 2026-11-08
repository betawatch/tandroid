package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class vl0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bm0 b;

    public vl0(bm0 bm0Var, int i7) {
        this.b = bm0Var;
        this.a = i7;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        bm0 bm0Var = this.b;
        hm0 hm0Var = bm0Var.p0;
        bm0Var.h();
        if (bm0Var.K != null) {
            if (bm0Var.J == null || !bm0Var.c()) {
                return;
            }
            bm0Var.J.g(false);
            return;
        }
        bi.v9 v9Var = this.a == 1 ? hm0Var.c : hm0Var.b;
        if (v9Var == null || !bm0Var.c()) {
            return;
        }
        v9Var.a();
    }
}
