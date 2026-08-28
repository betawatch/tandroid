package org.telegram.ui.web;

import android.content.Context;
import kh.b8;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class c extends i51 {
    public final /* synthetic */ k b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, Context context, int i9, b8 b8Var, a aVar, e3 e3Var) {
        super(context, i9, 0, false, b8Var, aVar, null, e3Var);
        this.b3 = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i9, int i10) {
        i iVar;
        if (canScrollVertically(1) || (iVar = this.b3.y) == null || !iVar.h) {
            return;
        }
        iVar.d();
    }
}
