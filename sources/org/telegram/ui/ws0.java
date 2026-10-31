package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ws0 extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ ys0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(ys0 ys0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = ys0Var;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(ih.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            un.t8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        at0.h0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        at0.i0(this.F.d, e6Var);
    }
}
