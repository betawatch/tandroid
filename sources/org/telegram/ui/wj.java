package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wj extends lh.e {
    public final /* synthetic */ cn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(cn cnVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, qi qiVar, dh.c cVar) {
        super(context, cVar, qiVar, g6Var);
        this.L = cnVar;
    }

    @Override // lh.e, android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.L.hd.h(3, i7 == 0, getMeasuredWidth() > 0);
    }
}
