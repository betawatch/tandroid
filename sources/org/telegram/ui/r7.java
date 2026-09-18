package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r7 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ m7 l0;
    public final /* synthetic */ s7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(s7 s7Var, Context context, m7 m7Var) {
        super(context, 0, null);
        this.m0 = s7Var;
        this.l0 = m7Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final void a() {
        u7 u7Var = this.m0.n;
        m7 m7Var = this.l0;
        u7.b(u7Var, (zh.a) m7Var.getTag(), m7Var);
    }
}
