package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.r71;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d extends r71 {
    public final /* synthetic */ l n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, Context context, int i10, hi.e2 e2Var, a aVar, h5 h5Var) {
        super(context, i10, 0, false, e2Var, aVar, null, h5Var);
        this.n3 = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        j jVar;
        if (canScrollVertically(1) || (jVar = this.n3.y) == null || !jVar.h) {
            return;
        }
        jVar.d();
    }
}
