package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qd extends org.telegram.ui.Components.wj0 {
    public final /* synthetic */ td d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(td tdVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, xd xdVar) {
        super(context, e6Var, xdVar);
        this.d0 = tdVar;
    }

    @Override // org.telegram.ui.Components.w61, android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.d0.x.R0 && super.canScrollHorizontally(i7);
    }
}
