package org.telegram.ui.web;

import android.content.Context;
import lh.a8;
import org.telegram.ui.Components.k51;
import org.telegram.ui.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d extends k51 {
    public final /* synthetic */ l b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, Context context, int i10, a8 a8Var, a aVar, i6 i6Var) {
        super(context, i10, 0, false, a8Var, aVar, null, i6Var);
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
