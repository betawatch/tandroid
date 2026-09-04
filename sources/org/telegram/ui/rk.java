package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
