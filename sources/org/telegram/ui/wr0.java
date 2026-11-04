package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr0 implements org.telegram.ui.ActionBar.p1, org.telegram.messenger.s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr0 b;

    public /* synthetic */ wr0(xr0 xr0Var, int i3) {
        this.a = i3;
        this.b = xr0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                this.b.d0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((org.telegram.ui.Components.r31) obj).d == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            boolean z10 = !q8Var.e.h;
            xr0 xr0Var = this.b;
            xr0Var.n = z10;
            q8Var.setChecked(z10);
            xr0Var.d.g3.O(true);
            xr0Var.a0(true);
        }
    }
}
