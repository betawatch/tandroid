package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xv0 extends org.telegram.ui.Cells.h5 {
    public final /* synthetic */ bw0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 18, 70, false, e6Var);
        this.w = bw0Var;
    }

    @Override // org.telegram.ui.Cells.h5
    public final int a(int i3) {
        ProfileActivity profileActivity = this.w.e;
        RectF rectF = ProfileActivity.T6;
        profileActivity.getClass();
        return i3;
    }
}
