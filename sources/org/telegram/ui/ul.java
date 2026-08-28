package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ul extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ bm H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(bm bmVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, b6Var);
        this.H = bmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        qn qnVar = this.H.M;
        int i9 = qn.Dc;
        return qnVar.R8();
    }
}
