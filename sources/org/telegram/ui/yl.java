package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class yl extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ fm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f = fmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        sn snVar = this.f.Q;
        int i10 = sn.Ic;
        return snVar.W8();
    }
}
