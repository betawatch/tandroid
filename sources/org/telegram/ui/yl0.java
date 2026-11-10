package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yl0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ em0 b;

    public yl0(em0 em0Var, int i7) {
        this.b = em0Var;
        this.a = i7;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        em0 em0Var = this.b;
        km0 km0Var = em0Var.p0;
        em0Var.h();
        if (em0Var.K != null) {
            if (em0Var.J == null || !em0Var.c()) {
                return;
            }
            em0Var.J.g(false);
            return;
        }
        bi.v9 v9Var = this.a == 1 ? km0Var.c : km0Var.b;
        if (v9Var == null || !em0Var.c()) {
            return;
        }
        v9Var.a();
    }
}
