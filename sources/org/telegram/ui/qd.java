package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
