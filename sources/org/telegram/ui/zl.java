package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zl extends org.telegram.ui.Cells.g0 {
    public final /* synthetic */ hm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(hm hmVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.L = hmVar;
    }

    @Override // org.telegram.ui.Cells.g0
    public final int getSideMenuWidth() {
        wn wnVar = this.L.Q;
        int i10 = wn.fd;
        return wnVar.e9();
    }
}
