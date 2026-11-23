package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v30 extends org.telegram.ui.Cells.g4 {
    public final /* synthetic */ y30 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(y30 y30Var, Context context) {
        super(context);
        this.h0 = y30Var;
    }

    @Override // org.telegram.ui.Cells.g4
    public final void d(org.telegram.ui.Cells.g4 g4Var) {
        e40 e40Var = this.h0.N;
        e40 e40Var2 = e40.C5;
        e40Var.M1(g4Var);
    }

    @Override // org.telegram.ui.Cells.g4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (org.telegram.messenger.g0.Q1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(420.0f), View.MeasureSpec.getSize(i7)), TLObject.FLAG_30), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }
}
