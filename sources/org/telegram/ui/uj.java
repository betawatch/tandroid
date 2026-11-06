package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class uj extends lh.e {
    public final /* synthetic */ an L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(an anVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, oi oiVar, dh.c cVar) {
        super(context, cVar, oiVar, f6Var);
        this.L = anVar;
    }

    @Override // lh.e, android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.L.fd.h(3, i7 == 0, getMeasuredWidth() > 0);
    }
}
