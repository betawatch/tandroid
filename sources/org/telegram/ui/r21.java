package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r21 extends kg.l1 {
    public final /* synthetic */ s21 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r21(s21 s21Var, Context context) {
        super(2, context, null);
        this.M = s21Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        s21 s21Var = this.M;
        if (s21Var.getParent() instanceof View) {
            ((View) s21Var.getParent()).invalidate();
        }
    }
}
