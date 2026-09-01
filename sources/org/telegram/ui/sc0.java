package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sc0 extends f2.a1 {
    public final /* synthetic */ bd0 a;

    public sc0(bd0 bd0Var) {
        this.a = bd0Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4 = i10 != 0;
        bd0 bd0Var = this.a;
        bd0Var.N = z4;
        if (z4 || bd0Var.I == null) {
            return;
        }
        bd0Var.I = null;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bd0 bd0Var = this.a;
        bd0Var.A0(false);
        if (bd0Var.I != null) {
            bd0Var.K += i11;
        }
    }
}
