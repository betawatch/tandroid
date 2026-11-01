package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r40 extends org.telegram.ui.Cells.h4 {
    public final /* synthetic */ u40 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(u40 u40Var, Context context) {
        super(context);
        this.g0 = u40Var;
    }

    @Override // org.telegram.ui.Cells.h4
    public final void d(org.telegram.ui.Cells.h4 h4Var) {
        a50 a50Var = this.g0.M;
        a50 a50Var2 = a50.u5;
        a50Var.I1(h4Var);
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
