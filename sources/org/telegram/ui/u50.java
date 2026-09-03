package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u50 extends org.telegram.ui.Cells.e4 {
    public final /* synthetic */ x50 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(x50 x50Var, Context context) {
        super(context);
        this.c0 = x50Var;
    }

    @Override // org.telegram.ui.Cells.e4
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        d60 d60Var = this.c0.J;
        d60 d60Var2 = d60.A3;
        d60Var.F1(e4Var);
    }

    @Override // org.telegram.ui.Cells.e4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
