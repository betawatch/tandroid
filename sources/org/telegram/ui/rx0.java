package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rx0 extends org.telegram.ui.Cells.z8 {
    public final /* synthetic */ xx0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx0(xx0 xx0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(18, context, p6Var, z10, z11);
        this.r = xx0Var;
    }

    @Override // org.telegram.ui.Cells.z8
    public final int a(int i10) {
        ProfileActivity profileActivity = this.r.e;
        RectF rectF = ProfileActivity.R6;
        profileActivity.getClass();
        return i10;
    }
}
