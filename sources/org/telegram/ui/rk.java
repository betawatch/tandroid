package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rk extends jh.e {
    public final /* synthetic */ zn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(zn znVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, jj jjVar, ah.c cVar) {
        super(cVar, context, jjVar, f6Var);
        this.L = znVar;
    }

    @Override // jh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Ac.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
