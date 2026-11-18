package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
