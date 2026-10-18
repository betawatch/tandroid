package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.a71;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class c extends a71 {
    public final /* synthetic */ k d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Context context, int i10, hg.o oVar, a aVar, mi.q qVar) {
        super(context, i10, 0, false, oVar, aVar, null, qVar);
        this.d3 = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        i iVar;
        if (canScrollVertically(1) || (iVar = this.d3.y) == null || !iVar.h) {
            return;
        }
        iVar.d();
    }
}
