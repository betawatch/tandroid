package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class s81 extends org.telegram.ui.Components.im0 {
    public int V2;
    public final /* synthetic */ r91 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s81(r91 r91Var, Context context) {
        super(context, null);
        this.W2 = r91Var;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        w81 w81Var;
        super.onMeasure(i10, i11);
        if (this.V2 != getMeasuredHeight() && (w81Var = this.W2.X) != null) {
            w81Var.l();
        }
        this.V2 = getMeasuredHeight();
    }
}
