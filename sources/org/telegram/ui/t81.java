package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t81 extends org.telegram.ui.Components.wk0 {
    public int T2;
    public final /* synthetic */ s91 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(s91 s91Var, Context context) {
        super(context, null);
        this.U2 = s91Var;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        x81 x81Var;
        super.onMeasure(i9, i10);
        if (this.T2 != getMeasuredHeight() && (x81Var = this.U2.T) != null) {
            x81Var.l();
        }
        this.T2 = getMeasuredHeight();
    }
}
