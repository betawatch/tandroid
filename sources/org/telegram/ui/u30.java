package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u30 extends Paint {
    public final /* synthetic */ b50 a;

    public u30(b50 b50Var) {
        this.a = b50Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        ViewGroup viewGroup = this.a.b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
