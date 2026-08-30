package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ve1 extends if1 {
    public final /* synthetic */ kf1 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve1(kf1 kf1Var, Context context) {
        super(kf1Var, context);
        this.f3 = kf1Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean S0() {
        ArrayList arrayList = this.f3.b;
        return (getAdapter() == null || this.U1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((bf1) arrayList.get(0)).c == null || ((bf1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.if1, org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f3.y0();
    }
}
