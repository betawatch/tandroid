package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xl0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dm0 b;

    public xl0(dm0 dm0Var, int i7) {
        this.b = dm0Var;
        this.a = i7;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        dm0 dm0Var = this.b;
        jm0 jm0Var = dm0Var.q0;
        dm0Var.h();
        if (dm0Var.L != null) {
            if (dm0Var.K == null || !dm0Var.c()) {
                return;
            }
            dm0Var.K.l(false);
            return;
        }
        di.p8 p8Var = this.a == 1 ? jm0Var.c : jm0Var.b;
        if (p8Var == null || !dm0Var.c()) {
            return;
        }
        p8Var.a();
    }
}
