package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u51 extends org.telegram.ui.Components.tk0 {
    public int e3;
    public final /* synthetic */ u61 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u51(u61 u61Var, Context context) {
        super(context, null);
        this.f3 = u61Var;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        z51 z51Var;
        super.onMeasure(i10, i11);
        if (this.e3 != getMeasuredHeight() && (z51Var = this.f3.W) != null) {
            z51Var.f();
        }
        this.e3 = getMeasuredHeight();
    }
}
