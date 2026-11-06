package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class sd extends org.telegram.ui.Components.rj0 {
    public final /* synthetic */ vd c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(vd vdVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, zd zdVar) {
        super(context, f6Var, zdVar);
        this.c0 = vdVar;
    }

    @Override // org.telegram.ui.Components.v61, android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.c0.x.Q0 && super.canScrollHorizontally(i7);
    }
}
