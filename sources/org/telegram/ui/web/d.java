package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.d61;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
