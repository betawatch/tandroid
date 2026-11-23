package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class zl0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fm0 b;

    public zl0(fm0 fm0Var, int i7) {
        this.b = fm0Var;
        this.a = i7;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        fm0 fm0Var = this.b;
        lm0 lm0Var = fm0Var.q0;
        fm0Var.h();
        if (fm0Var.L != null) {
            if (fm0Var.K == null || !fm0Var.c()) {
                return;
            }
            fm0Var.K.l(false);
            return;
        }
        di.p8 p8Var = this.a == 1 ? lm0Var.c : lm0Var.b;
        if (p8Var == null || !fm0Var.c()) {
            return;
        }
        p8Var.a();
    }
}
