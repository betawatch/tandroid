package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uu0 extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ wu0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(wu0 wu0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.B = wu0Var;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void g(gh.r rVar, ActionMode actionMode) {
        if (rVar.isFocused() && rVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            rn.k8(menu, this.B.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(boolean z10) {
        yu0.d0(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        yu0.e0(this.B.d, z5Var);
    }
}
