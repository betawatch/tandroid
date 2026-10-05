package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class y50 extends org.telegram.ui.Cells.e4 {
    public final /* synthetic */ b60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(b60 b60Var, Context context) {
        super(context);
        this.f0 = b60Var;
    }

    @Override // org.telegram.ui.Cells.e4
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        h60 h60Var = this.f0.M;
        h60 h60Var2 = h60.D3;
        h60Var.F1(e4Var);
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
