package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.f61;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class c extends f61 {
    public final /* synthetic */ k f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Context context, int i10, hi.a aVar, a aVar2, o0.a aVar3) {
        super(context, i10, 0, false, aVar, aVar2, null, aVar3);
        this.f3 = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10, int i11) {
        i iVar;
        if (canScrollVertically(1) || (iVar = this.f3.y) == null || !iVar.h) {
            return;
        }
        iVar.d();
    }
}
