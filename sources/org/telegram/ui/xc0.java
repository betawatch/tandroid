package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class xc0 extends s4.s0 {
    public final /* synthetic */ gd0 a;

    public xc0(gd0 gd0Var) {
        this.a = gd0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        gd0 gd0Var = this.a;
        gd0Var.Q = z10;
        if (z10 || gd0Var.L == null) {
            return;
        }
        gd0Var.L = null;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        gd0 gd0Var = this.a;
        gd0Var.A0(false);
        if (gd0Var.L != null) {
            gd0Var.N += i11;
        }
    }
}
