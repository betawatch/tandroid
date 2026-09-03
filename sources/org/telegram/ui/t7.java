package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t7 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ o7 i0;
    public final /* synthetic */ u7 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(u7 u7Var, Context context, o7 o7Var) {
        super(context, 0, null);
        this.j0 = u7Var;
        this.i0 = o7Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final void a() {
        w7 w7Var = this.j0.n;
        o7 o7Var = this.i0;
        w7.b(w7Var, (mh.a) o7Var.getTag(), o7Var);
    }
}
