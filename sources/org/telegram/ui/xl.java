package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xl extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ em f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(em emVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f = emVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        tn tnVar = this.f.M;
        int i10 = tn.Dc;
        return tnVar.R8();
    }
}
