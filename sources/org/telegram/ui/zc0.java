package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
