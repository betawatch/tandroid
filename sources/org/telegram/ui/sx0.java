package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class sx0 extends org.telegram.ui.Cells.l5 {
    public final /* synthetic */ wx0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx0(wx0 wx0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(18, 70, context, p6Var, false);
        this.w = wx0Var;
    }

    @Override // org.telegram.ui.Cells.l5
    public final int a(int i10) {
        ProfileActivity profileActivity = this.w.e;
        RectF rectF = ProfileActivity.S6;
        profileActivity.getClass();
        return i10;
    }
}
