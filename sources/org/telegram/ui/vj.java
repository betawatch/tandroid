package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
