package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class s7 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ n7 l0;
    public final /* synthetic */ t7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(t7 t7Var, Context context, n7 n7Var) {
        super(context, 0, null);
        this.m0 = t7Var;
        this.l0 = n7Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final void a() {
        v7 v7Var = this.m0.n;
        n7 n7Var = this.l0;
        v7.b(v7Var, (bi.b) n7Var.getTag(), n7Var);
    }
}
