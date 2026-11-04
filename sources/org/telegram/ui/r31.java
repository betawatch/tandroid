package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r31 extends org.telegram.ui.Components.tj0 {
    public int f3;
    public final /* synthetic */ r41 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r31(r41 r41Var, Context context) {
        super(context, null);
        this.g3 = r41Var;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        w31 w31Var;
        super.onMeasure(i3, i10);
        if (this.f3 != getMeasuredHeight() && (w31Var = this.g3.X) != null) {
            w31Var.f();
        }
        this.f3 = getMeasuredHeight();
    }
}
