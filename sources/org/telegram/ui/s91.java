package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class s91 extends org.telegram.ui.Components.ml0 {
    public int X2;
    public final /* synthetic */ ra1 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s91(ra1 ra1Var, Context context) {
        super(context, null);
        this.Y2 = ra1Var;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        w91 w91Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (w91Var = this.Y2.X) != null) {
            w91Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
