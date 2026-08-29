package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u81 extends org.telegram.ui.Components.jl0 {
    public int T2;
    public final /* synthetic */ t91 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u81(t91 t91Var, Context context) {
        super(context, null);
        this.U2 = t91Var;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        y81 y81Var;
        super.onMeasure(i10, i11);
        if (this.T2 != getMeasuredHeight() && (y81Var = this.U2.T) != null) {
            y81Var.l();
        }
        this.T2 = getMeasuredHeight();
    }
}
