package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class vj extends lh.e {
    public final /* synthetic */ bn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(bn bnVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, pi piVar, dh.c cVar) {
        super(context, cVar, piVar, i6Var);
        this.M = bnVar;
    }

    @Override // lh.e, android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.M.jd.h(3, i7 == 0, getMeasuredWidth() > 0);
    }
}
