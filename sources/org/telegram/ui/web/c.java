package org.telegram.ui.web;

import android.content.Context;
import n7.qa;
import org.telegram.ui.Components.g61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class c extends g61 {
    public final /* synthetic */ k c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Context context, int i10, dg.r1 r1Var, a aVar, qa qaVar) {
        super(context, i10, 0, false, r1Var, aVar, null, qaVar);
        this.c3 = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        i iVar;
        if (canScrollVertically(1) || (iVar = this.c3.y) == null || !iVar.h) {
            return;
        }
        iVar.d();
    }
}
