package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.b71;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class c extends b71 {
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
