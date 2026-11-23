package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class qd extends org.telegram.ui.Components.gk0 {
    public final /* synthetic */ td d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(td tdVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, xd xdVar) {
        super(context, h6Var, xdVar);
        this.d0 = tdVar;
    }

    @Override // org.telegram.ui.Components.j71, android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.d0.x.R0 && super.canScrollHorizontally(i7);
    }
}
