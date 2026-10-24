package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class xl extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ em f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(em emVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.f = emVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        sn snVar = this.f.Q;
        int i10 = sn.Vc;
        return snVar.W8();
    }
}
