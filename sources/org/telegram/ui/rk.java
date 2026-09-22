package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rk extends jh.e {
    public final /* synthetic */ bo L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(bo boVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, jj jjVar, ah.c cVar) {
        super(cVar, context, jjVar, e6Var);
        this.L = boVar;
    }

    @Override // jh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Ac.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
