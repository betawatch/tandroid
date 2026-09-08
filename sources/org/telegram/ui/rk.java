package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class rk extends kh.e {
    public final /* synthetic */ co L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(co coVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, jj jjVar, bh.b bVar) {
        super(context, bVar, jjVar, f6Var);
        this.L = coVar;
    }

    @Override // kh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Bc.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
