package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wk extends kh.e {
    public final /* synthetic */ fo L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(fo foVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, oj ojVar, bh.b bVar) {
        super(context, bVar, ojVar, c6Var);
        this.L = foVar;
    }

    @Override // kh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Bc.i(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
