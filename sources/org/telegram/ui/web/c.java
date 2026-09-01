package org.telegram.ui.web;

import android.content.Context;
import n7.qa;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class c extends i61 {
    public final /* synthetic */ k c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Context context, int i10, eg.p1 p1Var, a aVar, qa qaVar) {
        super(context, i10, 0, false, p1Var, aVar, null, qaVar);
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
