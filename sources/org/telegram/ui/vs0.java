package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vs0 extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ xs0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(xs0 xs0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = xs0Var;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(ih.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            un.x8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        zs0.i0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zs0.j0(this.F.d, e6Var);
    }
}
