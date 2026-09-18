package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class yv0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ aw0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv0(aw0 aw0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = aw0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            bo.k8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        cw0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        cw0.e0(this.F.d, c6Var);
    }
}
