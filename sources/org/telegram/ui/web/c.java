package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.e71;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class c extends e71 {
    public final /* synthetic */ k m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Context context, int i10, hi.a aVar, a aVar2, o0.a aVar3) {
        super(context, i10, 0, false, aVar, aVar2, null, aVar3);
        this.m3 = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        i iVar;
        if (canScrollVertically(1) || (iVar = this.m3.y) == null || !iVar.h) {
            return;
        }
        iVar.d();
    }
}
