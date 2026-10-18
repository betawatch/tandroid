package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class xl extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ fm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.L = fmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        sn snVar = this.L.Q;
        int i10 = sn.Ic;
        return snVar.W8();
    }
}
