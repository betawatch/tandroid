package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x81 extends org.telegram.ui.Components.nm0 {
    public int f3;
    public final /* synthetic */ y91 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x81(y91 y91Var, Context context) {
        super(context, null);
        this.g3 = y91Var;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        d91 d91Var;
        super.onMeasure(i10, i11);
        if (this.f3 != getMeasuredHeight() && (d91Var = this.g3.W) != null) {
            d91Var.l();
        }
        this.f3 = getMeasuredHeight();
    }
}
