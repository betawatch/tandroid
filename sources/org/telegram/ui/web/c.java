package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.r61;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class c extends r61 {
    public final /* synthetic */ k f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Context context, int i10, hi.a aVar, a aVar2, o0.a aVar3) {
        super(context, i10, 0, false, aVar, aVar2, null, aVar3);
        this.f3 = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        i iVar;
        if (canScrollVertically(1) || (iVar = this.f3.y) == null || !iVar.h) {
            return;
        }
        iVar.d();
    }
}
