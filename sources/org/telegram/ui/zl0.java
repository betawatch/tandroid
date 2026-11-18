package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        di.o8 o8Var = this.a == 1 ? lm0Var.c : lm0Var.b;
        if (o8Var == null || !fm0Var.c()) {
            return;
        }
        o8Var.a();
    }
}
