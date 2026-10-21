package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class vl extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ dm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(dm dmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.L = dmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        qn qnVar = this.L.Q;
        int i10 = qn.Ic;
        return qnVar.W8();
    }
}
