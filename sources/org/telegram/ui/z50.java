package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class z50 extends org.telegram.ui.Cells.e4 {
    public final /* synthetic */ c60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(c60 c60Var, Context context) {
        super(context);
        this.f0 = c60Var;
    }

    @Override // org.telegram.ui.Cells.e4
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        i60 i60Var = this.f0.M;
        i60 i60Var2 = i60.D3;
        i60Var.F1(e4Var);
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
