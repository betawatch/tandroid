package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sk extends jh.e {
    public final /* synthetic */ zn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(zn znVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, kj kjVar, ah.c cVar) {
        super(cVar, context, kjVar, e6Var);
        this.L = znVar;
    }

    @Override // jh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Bc.i(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
