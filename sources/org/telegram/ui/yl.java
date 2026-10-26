package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yl extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ fm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.f = fmVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        un unVar = this.f.Q;
        int i10 = un.bd;
        return unVar.b9();
    }
}
