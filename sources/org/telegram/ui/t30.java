package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t30 extends org.telegram.ui.Cells.f4 {
    public final /* synthetic */ w30 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t30(w30 w30Var, Context context) {
        super(context);
        this.h0 = w30Var;
    }

    @Override // org.telegram.ui.Cells.f4
    public final void d(org.telegram.ui.Cells.f4 f4Var) {
        c40 c40Var = this.h0.N;
        c40 c40Var2 = c40.C5;
        c40Var.L1(f4Var);
    }

    @Override // org.telegram.ui.Cells.f4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (org.telegram.messenger.g0.Q1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(420.0f), View.MeasureSpec.getSize(i7)), TLObject.FLAG_30), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }
}
