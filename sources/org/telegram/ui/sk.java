package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class sk extends jh.e {
    public final /* synthetic */ bo L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(bo boVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, kj kjVar, ah.c cVar) {
        super(cVar, context, kjVar, f6Var);
        this.L = boVar;
    }

    @Override // jh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Ac.j(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
