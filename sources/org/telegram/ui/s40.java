package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s40 extends org.telegram.ui.Cells.h4 {
    public final /* synthetic */ v40 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s40(v40 v40Var, Context context) {
        super(context);
        this.g0 = v40Var;
    }

    @Override // org.telegram.ui.Cells.h4
    public final void d(org.telegram.ui.Cells.h4 h4Var) {
        b50 b50Var = this.g0.M;
        b50 b50Var2 = b50.u5;
        b50Var.I1(h4Var);
    }

    @Override // org.telegram.ui.Cells.h4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (org.telegram.messenger.i0.Q1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(420.0f), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
