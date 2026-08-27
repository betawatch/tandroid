package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r81 extends org.telegram.ui.Components.zk0 {
    public int T2;
    public final /* synthetic */ q91 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r81(q91 q91Var, Context context) {
        super(context, null);
        this.U2 = q91Var;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        v81 v81Var;
        super.onMeasure(i10, i11);
        if (this.T2 != getMeasuredHeight() && (v81Var = this.U2.T) != null) {
            v81Var.l();
        }
        this.T2 = getMeasuredHeight();
    }
}
