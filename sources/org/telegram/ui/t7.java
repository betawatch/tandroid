package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t7 extends org.telegram.ui.Cells.n7 {
    public final /* synthetic */ o7 l0;
    public final /* synthetic */ u7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(u7 u7Var, Context context, o7 o7Var) {
        super(context, 0, null);
        this.m0 = u7Var;
        this.l0 = o7Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final void a() {
        x7 x7Var = this.m0.n;
        o7 o7Var = this.l0;
        x7.b(x7Var, (ci.a) o7Var.getTag(), o7Var);
    }
}
