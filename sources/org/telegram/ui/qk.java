package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class qk extends jh.e {
    public final /* synthetic */ zn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(zn znVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, ij ijVar, ah.c cVar) {
        super(cVar, context, ijVar, e6Var);
        this.L = znVar;
    }

    @Override // jh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Ac.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
