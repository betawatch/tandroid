package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.h71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class c extends h71 {
    public final /* synthetic */ k d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Context context, int i10, ii.a aVar, a aVar2, m4.c cVar) {
        super(context, i10, 0, false, aVar, aVar2, null, cVar);
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
