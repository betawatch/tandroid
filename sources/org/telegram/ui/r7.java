package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class r7 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ m7 i0;
    public final /* synthetic */ s7 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(s7 s7Var, Context context, m7 m7Var) {
        super(context, 0, null);
        this.j0 = s7Var;
        this.i0 = m7Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final void a() {
        u7 u7Var = this.j0.n;
        m7 m7Var = this.i0;
        u7.b(u7Var, (nh.a) m7Var.getTag(), m7Var);
    }
}
