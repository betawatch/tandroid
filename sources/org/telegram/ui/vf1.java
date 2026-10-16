package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vf1 extends ig1 {
    public final /* synthetic */ kg1 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf1(kg1 kg1Var, Context context) {
        super(kg1Var, context);
        this.g3 = kg1Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean S0() {
        ArrayList arrayList = this.g3.b;
        return (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((bg1) arrayList.get(0)).c == null || ((bg1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.ig1, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.g3.y0();
    }
}
