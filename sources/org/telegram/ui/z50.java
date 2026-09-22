package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class z50 extends org.telegram.ui.Cells.f4 {
    public final /* synthetic */ c60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z50(c60 c60Var, Context context) {
        super(context);
        this.f0 = c60Var;
    }

    @Override // org.telegram.ui.Cells.f4
    public final void d(org.telegram.ui.Cells.f4 f4Var) {
        i60 i60Var = this.f0.M;
        i60 i60Var2 = i60.D3;
        i60Var.F1(f4Var);
    }

    @Override // org.telegram.ui.Cells.f4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
