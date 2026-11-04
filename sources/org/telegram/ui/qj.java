package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qj extends mh.e {
    public final /* synthetic */ wm M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(wm wmVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar, eh.c cVar) {
        super(context, cVar, kiVar, e6Var);
        this.M = wmVar;
    }

    @Override // mh.e, android.view.View
    public final void setVisibility(int i3) {
        super.setVisibility(i3);
        this.M.gd.h(3, i3 == 0, getMeasuredWidth() > 0);
    }
}
