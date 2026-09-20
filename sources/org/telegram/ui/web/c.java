package org.telegram.ui.web;

import android.content.Context;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class c extends s61 {
    public final /* synthetic */ k f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Context context, int i10, hi.a aVar, a aVar2, m5.e eVar) {
        super(context, i10, 0, false, aVar, aVar2, null, eVar);
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
