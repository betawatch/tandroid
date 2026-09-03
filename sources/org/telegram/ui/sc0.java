package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
