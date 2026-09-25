package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class tc0 extends s4.s0 {
    public final /* synthetic */ cd0 a;

    public tc0(cd0 cd0Var) {
        this.a = cd0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        cd0 cd0Var = this.a;
        cd0Var.Q = z10;
        if (z10 || cd0Var.L == null) {
            return;
        }
        cd0Var.L = null;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        cd0 cd0Var = this.a;
        cd0Var.A0(false);
        if (cd0Var.L != null) {
            cd0Var.N += i11;
        }
    }
}
