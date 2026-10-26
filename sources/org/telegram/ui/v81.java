package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v81 extends org.telegram.ui.Components.mm0 {
    public int f3;
    public final /* synthetic */ w91 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v81(w91 w91Var, Context context) {
        super(context, null);
        this.g3 = w91Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        b91 b91Var;
        super.onMeasure(i10, i11);
        if (this.f3 != getMeasuredHeight() && (b91Var = this.g3.W) != null) {
            b91Var.l();
        }
        this.f3 = getMeasuredHeight();
    }
}
