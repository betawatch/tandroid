package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.a71;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class d extends a71 {
    public final /* synthetic */ l d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, Context context, int i10, hg.o oVar, a aVar, mi.q qVar) {
        super(context, i10, 0, false, oVar, aVar, null, qVar);
        this.d3 = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        j jVar;
        if (canScrollVertically(1) || (jVar = this.d3.y) == null || !jVar.h) {
            return;
        }
        jVar.d();
    }
}
