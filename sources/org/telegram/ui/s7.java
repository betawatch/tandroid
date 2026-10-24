package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class s7 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ n7 l0;
    public final /* synthetic */ t7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(t7 t7Var, Context context, n7 n7Var) {
        super(context, 0, null);
        this.m0 = t7Var;
        this.l0 = n7Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a() {
        v7 v7Var = this.m0.n;
        n7 n7Var = this.l0;
        v7.b(v7Var, (bi.b) n7Var.getTag(), n7Var);
    }
}
