package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class d extends j71 {
    public final /* synthetic */ l g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, Context context, int i10, hg.o oVar, a aVar, f5 f5Var) {
        super(context, i10, 0, false, oVar, aVar, null, f5Var);
        this.g3 = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        j jVar;
        if (canScrollVertically(1) || (jVar = this.g3.y) == null || !jVar.h) {
            return;
        }
        jVar.d();
    }
}
