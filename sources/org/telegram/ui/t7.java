package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
