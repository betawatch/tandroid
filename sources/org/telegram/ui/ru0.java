package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ru0 extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ tu0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru0(tu0 tu0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.B = tu0Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(bh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            tn.k8(menu, this.B.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z10) {
        vu0.d0(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        vu0.e0(this.B.d, a6Var);
    }
}
