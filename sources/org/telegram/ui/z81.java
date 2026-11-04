package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z81 extends k91 {
    public final /* synthetic */ m91 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z81(m91 m91Var, Context context) {
        super(m91Var, context);
        this.p3 = m91Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean R0() {
        ArrayList arrayList = this.p3.b;
        return (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((e91) arrayList.get(0)).c == null || ((e91) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // org.telegram.ui.k91, org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.p3.C0();
    }
}
