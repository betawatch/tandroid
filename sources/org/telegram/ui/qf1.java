package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qf1 extends dg1 {
    public final /* synthetic */ fg1 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf1(fg1 fg1Var, Context context) {
        super(fg1Var, context);
        this.g3 = fg1Var;
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean S0() {
        ArrayList arrayList = this.g3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((wf1) arrayList.get(0)).c == null || ((wf1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.dg1, org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.g3.y0();
    }
}
