package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class t91 extends org.telegram.ui.Components.wl0 {
    public int X2;
    public final /* synthetic */ sa1 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t91(sa1 sa1Var, Context context) {
        super(context, null);
        this.Y2 = sa1Var;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        x91 x91Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (x91Var = this.Y2.X) != null) {
            x91Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
