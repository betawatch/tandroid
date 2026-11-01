package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qk extends bh.h {
    public final /* synthetic */ un L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(un unVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, jj jjVar, tg.b bVar) {
        super(context, p6Var, bVar, jjVar);
        this.L = unVar;
    }

    @Override // bh.h, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Yc.h(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
