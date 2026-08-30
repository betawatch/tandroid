package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rc0 extends f2.z0 {
    public final /* synthetic */ ad0 a;

    public rc0(ad0 ad0Var) {
        this.a = ad0Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4 = i10 != 0;
        ad0 ad0Var = this.a;
        ad0Var.N = z4;
        if (z4 || ad0Var.I == null) {
            return;
        }
        ad0Var.I = null;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ad0 ad0Var = this.a;
        ad0Var.A0(false);
        if (ad0Var.I != null) {
            ad0Var.K += i11;
        }
    }
}
