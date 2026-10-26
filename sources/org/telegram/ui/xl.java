package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xl extends org.telegram.ui.Cells.g0 {
    public final /* synthetic */ fm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.L = fmVar;
    }

    @Override // org.telegram.ui.Cells.g0
    public final int getSideMenuWidth() {
        un unVar = this.L.Q;
        int i10 = un.bd;
        return unVar.b9();
    }
}
