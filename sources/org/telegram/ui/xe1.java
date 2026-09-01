package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xe1 extends kf1 {
    public final /* synthetic */ mf1 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe1(mf1 mf1Var, Context context) {
        super(mf1Var, context);
        this.f3 = mf1Var;
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean S0() {
        ArrayList arrayList = this.f3.b;
        return (getAdapter() == null || this.U1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((df1) arrayList.get(0)).c == null || ((df1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.kf1, org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f3.y0();
    }
}
