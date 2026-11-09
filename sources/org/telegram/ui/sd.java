package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sd extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ vd c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(vd vdVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, zd zdVar) {
        super(context, g6Var, zdVar);
        this.c0 = vdVar;
    }

    @Override // org.telegram.ui.Components.w61, android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.c0.x.Q0 && super.canScrollHorizontally(i7);
    }
}
