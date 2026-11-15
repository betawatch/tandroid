package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xl0 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dm0 b;

    public xl0(dm0 dm0Var, int i7) {
        this.b = dm0Var;
        this.a = i7;
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        dm0 dm0Var = this.b;
        jm0 jm0Var = dm0Var.q0;
        dm0Var.h();
        if (dm0Var.L != null) {
            if (dm0Var.K == null || !dm0Var.c()) {
                return;
            }
            dm0Var.K.g(false);
            return;
        }
        di.l8 l8Var = this.a == 1 ? jm0Var.c : jm0Var.b;
        if (l8Var == null || !dm0Var.c()) {
            return;
        }
        l8Var.a();
    }
}
