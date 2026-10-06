package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class r7 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ m7 l0;
    public final /* synthetic */ s7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(s7 s7Var, Context context, m7 m7Var) {
        super(context, 0, null);
        this.m0 = s7Var;
        this.l0 = m7Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a() {
        v7 v7Var = this.m0.n;
        m7 m7Var = this.l0;
        v7.b(v7Var, (zh.a) m7Var.getTag(), m7Var);
    }
}
