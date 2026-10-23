package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class wl extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ dm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(dm dmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f = dmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        qn qnVar = this.f.Q;
        int i10 = qn.Ic;
        return qnVar.W8();
    }
}
