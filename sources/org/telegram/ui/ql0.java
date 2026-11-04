package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ql0 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl0 b;

    public ql0(wl0 wl0Var, int i3) {
        this.b = wl0Var;
        this.a = i3;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        wl0 wl0Var = this.b;
        cm0 cm0Var = wl0Var.q0;
        wl0Var.h();
        if (wl0Var.L != null) {
            if (wl0Var.K == null || !wl0Var.c()) {
                return;
            }
            wl0Var.K.g(false);
            return;
        }
        ci.v8 v8Var = this.a == 1 ? cm0Var.c : cm0Var.b;
        if (v8Var == null || !wl0Var.c()) {
            return;
        }
        v8Var.a();
    }
}
