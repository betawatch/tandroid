package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tf1 extends gg1 {
    public final /* synthetic */ ig1 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf1(ig1 ig1Var, Context context) {
        super(ig1Var, context);
        this.i3 = ig1Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean R0() {
        ArrayList arrayList = this.i3.b;
        return (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((zf1) arrayList.get(0)).c == null || ((zf1) arrayList.get(0)).c.id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.gg1, org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.i3.y0();
    }
}
