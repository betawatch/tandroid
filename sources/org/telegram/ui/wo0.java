package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wo0 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp0 b;

    public wo0(bp0 bp0Var, int i10) {
        this.b = bp0Var;
        this.a = i10;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bp0 bp0Var = this.b;
        gp0 gp0Var = bp0Var.g0;
        if (bp0Var.C != null) {
            if (bp0Var.B == null || !bp0Var.c()) {
                return;
            }
            bp0Var.B.g(false);
            return;
        }
        lh.l7 l7Var = this.a == 1 ? gp0Var.c : gp0Var.b;
        if (l7Var == null || !bp0Var.c()) {
            return;
        }
        l7Var.a();
    }
}
