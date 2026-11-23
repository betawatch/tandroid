package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class vj extends lh.e {
    public final /* synthetic */ bn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(bn bnVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, pi piVar, dh.c cVar) {
        super(context, cVar, piVar, h6Var);
        this.M = bnVar;
    }

    @Override // lh.e, android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.M.jd.h(3, i7 == 0, getMeasuredWidth() > 0);
    }
}
