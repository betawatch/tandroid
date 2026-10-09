package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yc0 extends s4.t0 {
    public final /* synthetic */ hd0 a;

    public yc0(hd0 hd0Var) {
        this.a = hd0Var;
    }

    @Override // s4.t0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        hd0 hd0Var = this.a;
        hd0Var.Q = z10;
        if (z10 || hd0Var.L == null) {
            return;
        }
        hd0Var.L = null;
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        hd0 hd0Var = this.a;
        hd0Var.z0(false);
        if (hd0Var.L != null) {
            hd0Var.N += i11;
        }
    }
}
