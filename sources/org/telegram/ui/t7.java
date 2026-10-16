package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class t7 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ o7 l0;
    public final /* synthetic */ u7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(u7 u7Var, Context context, o7 o7Var) {
        super(context, 0, null);
        this.m0 = u7Var;
        this.l0 = o7Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final void a() {
        w7 w7Var = this.m0.n;
        o7 o7Var = this.l0;
        w7.b(w7Var, (ai.b) o7Var.getTag(), o7Var);
    }
}
