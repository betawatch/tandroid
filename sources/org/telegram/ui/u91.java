package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class u91 extends org.telegram.ui.Components.zl0 {
    public int e3;
    public final /* synthetic */ va1 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u91(va1 va1Var, Context context) {
        super(context, null);
        this.f3 = va1Var;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        aa1 aa1Var;
        super.onMeasure(i10, i11);
        if (this.e3 != getMeasuredHeight() && (aa1Var = this.f3.W) != null) {
            aa1Var.l();
        }
        this.e3 = getMeasuredHeight();
    }
}
