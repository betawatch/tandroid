package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class t91 extends org.telegram.ui.Components.yl0 {
    public int X2;
    public final /* synthetic */ sa1 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t91(sa1 sa1Var, Context context) {
        super(context, null);
        this.Y2 = sa1Var;
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        x91 x91Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (x91Var = this.Y2.X) != null) {
            x91Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
