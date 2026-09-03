package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tc0 extends f2.z0 {
    public final /* synthetic */ cd0 a;

    public tc0(cd0 cd0Var) {
        this.a = cd0Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4 = i10 != 0;
        cd0 cd0Var = this.a;
        cd0Var.N = z4;
        if (z4 || cd0Var.I == null) {
            return;
        }
        cd0Var.I = null;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        cd0 cd0Var = this.a;
        cd0Var.A0(false);
        if (cd0Var.I != null) {
            cd0Var.K += i11;
        }
    }
}
