package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.s71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d extends s71 {
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
