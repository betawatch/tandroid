package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class zc0 extends s4.s0 {
    public final /* synthetic */ id0 a;

    public zc0(id0 id0Var) {
        this.a = id0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        id0 id0Var = this.a;
        id0Var.Q = z10;
        if (z10 || id0Var.L == null) {
            return;
        }
        id0Var.L = null;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        id0 id0Var = this.a;
        id0Var.A0(false);
        if (id0Var.L != null) {
            id0Var.N += i11;
        }
    }
}
