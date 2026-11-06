package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class sd extends org.telegram.ui.Components.rj0 {
    public final /* synthetic */ vd c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(vd vdVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, zd zdVar) {
        super(context, f6Var, zdVar);
        this.c0 = vdVar;
    }

    @Override // org.telegram.ui.Components.p61, android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.c0.x.Q0 && super.canScrollHorizontally(i7);
    }
}
