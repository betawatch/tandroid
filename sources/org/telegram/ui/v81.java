package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class v81 extends org.telegram.ui.Components.mm0 {
    public int Y2;
    public final /* synthetic */ u91 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v81(u91 u91Var, Context context) {
        super(context, null);
        this.Z2 = u91Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        z81 z81Var;
        super.onMeasure(i10, i11);
        if (this.Y2 != getMeasuredHeight() && (z81Var = this.Z2.X) != null) {
            z81Var.l();
        }
        this.Y2 = getMeasuredHeight();
    }
}
