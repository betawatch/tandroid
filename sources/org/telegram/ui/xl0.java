package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xl0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dm0 b;

    public xl0(dm0 dm0Var, int i7) {
        this.b = dm0Var;
        this.a = i7;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        dm0 dm0Var = this.b;
        jm0 jm0Var = dm0Var.p0;
        dm0Var.h();
        if (dm0Var.K != null) {
            if (dm0Var.J == null || !dm0Var.c()) {
                return;
            }
            dm0Var.J.g(false);
            return;
        }
        bi.v9 v9Var = this.a == 1 ? jm0Var.c : jm0Var.b;
        if (v9Var == null || !dm0Var.c()) {
            return;
        }
        v9Var.a();
    }
}
