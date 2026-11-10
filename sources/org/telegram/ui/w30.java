package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w30 extends org.telegram.ui.Cells.f4 {
    public final /* synthetic */ z30 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(z30 z30Var, Context context) {
        super(context);
        this.g0 = z30Var;
    }

    @Override // org.telegram.ui.Cells.f4
    public final void d(org.telegram.ui.Cells.f4 f4Var) {
        f40 f40Var = this.g0.M;
        f40 f40Var2 = f40.x5;
        f40Var.L1(f4Var);
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
