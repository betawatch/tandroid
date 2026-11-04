package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vv0 extends org.telegram.ui.Cells.w8 {
    public final /* synthetic */ bw0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(18, context, e6Var, z10, z11);
        this.r = bw0Var;
    }

    @Override // org.telegram.ui.Cells.w8
    public final int a(int i3) {
        ProfileActivity profileActivity = this.r.e;
        RectF rectF = ProfileActivity.T6;
        profileActivity.getClass();
        return i3;
    }
}
