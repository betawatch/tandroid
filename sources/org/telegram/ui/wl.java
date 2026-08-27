package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wl extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ dm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(dm dmVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f = dmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        rn rnVar = this.f.M;
        int i10 = rn.Dc;
        return rnVar.R8();
    }
}
