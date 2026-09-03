package org.telegram.ui.web;

import android.content.Context;
import n7.qa;
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c extends h61 {
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
