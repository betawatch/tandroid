package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
