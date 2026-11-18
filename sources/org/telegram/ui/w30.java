package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class w30 extends org.telegram.ui.Cells.g4 {
    public final /* synthetic */ z30 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(z30 z30Var, Context context) {
        super(context);
        this.h0 = z30Var;
    }

    @Override // org.telegram.ui.Cells.g4
    public final void d(org.telegram.ui.Cells.g4 g4Var) {
        f40 f40Var = this.h0.N;
        f40 f40Var2 = f40.C5;
        f40Var.M1(g4Var);
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
