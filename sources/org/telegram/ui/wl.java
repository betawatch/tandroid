package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class wl extends org.telegram.ui.Cells.g0 {
    public final /* synthetic */ em L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(em emVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.L = emVar;
    }

    @Override // org.telegram.ui.Cells.g0
    public final int getSideMenuWidth() {
        sn snVar = this.L.Q;
        int i10 = sn.Vc;
        return snVar.W8();
    }
}
