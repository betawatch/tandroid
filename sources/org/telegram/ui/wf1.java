package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wf1 extends jg1 {
    public final /* synthetic */ lg1 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf1(lg1 lg1Var, Context context) {
        super(lg1Var, context);
        this.g3 = lg1Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean S0() {
        ArrayList arrayList = this.g3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((cg1) arrayList.get(0)).c == null || ((cg1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.jg1, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.g3.y0();
    }
}
