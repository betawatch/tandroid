package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wj extends lh.e {
    public final /* synthetic */ cn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(cn cnVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, qi qiVar, dh.c cVar) {
        super(context, cVar, qiVar, h6Var);
        this.L = cnVar;
    }

    @Override // lh.e, android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.L.hd.h(3, i7 == 0, getMeasuredWidth() > 0);
    }
}
