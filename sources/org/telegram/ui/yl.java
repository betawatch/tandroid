package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class yl extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ fm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f = fmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        sn snVar = this.f.Q;
        int i10 = sn.Hc;
        return snVar.W8();
    }
}
