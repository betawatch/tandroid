package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class w50 extends org.telegram.ui.Cells.e4 {
    public final /* synthetic */ z50 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(z50 z50Var, Context context) {
        super(context);
        this.f0 = z50Var;
    }

    @Override // org.telegram.ui.Cells.e4
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        f60 f60Var = this.f0.M;
        f60 f60Var2 = f60.D3;
        f60Var.F1(e4Var);
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
