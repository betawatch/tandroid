package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.d61;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class d extends d61 {
    public final /* synthetic */ l f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, Context context, int i10, ii.a aVar, a aVar2, o0.a aVar3) {
        super(context, i10, 0, false, aVar, aVar2, null, aVar3);
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
