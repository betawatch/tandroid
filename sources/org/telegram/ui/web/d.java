package org.telegram.ui.web;

import android.content.Context;
import nh.t4;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d extends u51 {
    public final /* synthetic */ l b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, Context context, int i10, t4 t4Var, a aVar, oc.i iVar) {
        super(context, i10, 0, false, t4Var, aVar, null, iVar);
        this.b3 = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        j jVar;
        if (canScrollVertically(1) || (jVar = this.b3.y) == null || !jVar.h) {
            return;
        }
        jVar.d();
    }
}
