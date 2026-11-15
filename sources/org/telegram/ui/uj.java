package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class uj extends lh.e {
    public final /* synthetic */ an M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(an anVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, oi oiVar, dh.c cVar) {
        super(context, cVar, oiVar, e6Var);
        this.M = anVar;
    }

    @Override // lh.e, android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.M.id.h(3, i7 == 0, getMeasuredWidth() > 0);
    }
}
