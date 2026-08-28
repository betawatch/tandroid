package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tu0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ vu0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu0(vu0 vu0Var, Context context, int i9) {
        super(context, i9, null, null);
        this.B = vu0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(fh.s sVar, ActionMode actionMode) {
        if (sVar.isFocused() && sVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            qn.k8(menu, this.B.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        xu0.c0(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        xu0.d0(this.B.d, c6Var);
    }
}
