package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tx0 extends org.telegram.ui.Cells.l5 {
    public final /* synthetic */ xx0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx0(xx0 xx0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(18, 70, context, p6Var, false);
        this.w = xx0Var;
    }

    @Override // org.telegram.ui.Cells.l5
    public final int a(int i10) {
        ProfileActivity profileActivity = this.w.e;
        RectF rectF = ProfileActivity.R6;
        profileActivity.getClass();
        return i10;
    }
}
