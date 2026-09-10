package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.r61;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class d extends r61 {
    public final /* synthetic */ l f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, Context context, int i10, gi.a aVar, a aVar2, n7.a1 a1Var) {
        super(context, i10, 0, false, aVar, aVar2, null, a1Var);
        this.f3 = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        j jVar;
        if (canScrollVertically(1) || (jVar = this.f3.y) == null || !jVar.h) {
            return;
        }
        jVar.d();
    }
}
