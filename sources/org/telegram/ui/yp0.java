package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp0 implements org.telegram.ui.Components.e5, org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq0 b;

    public /* synthetic */ yp0(lq0 lq0Var, int i10) {
        this.a = i10;
        this.b = lq0Var;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.e0(i10, z10);
                break;
            default:
                this.b.e0(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        lq0 lq0Var = this.b;
        if (lq0Var.Y) {
            lq0Var.a0(view, lq0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.s5)) {
            return false;
        }
        org.telegram.ui.Components.km0 km0Var = lq0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
        lq0Var.X = z10;
        km0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        lq0 lq0Var = this.b;
        pq0 pq0Var = lq0Var.t0;
        if (pq0Var == null) {
            lq0Var.Z();
            return;
        }
        switch (pq0Var.a) {
            case 0:
                qq0 qq0Var = pq0Var.b;
                qq0Var.a.Z();
                qq0Var.b.Z();
                break;
            default:
                qq0 qq0Var2 = pq0Var.b;
                qq0Var2.a.Z();
                qq0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        lq0 lq0Var = this.b;
        lq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = lq0Var.m0) != null && m1Var.isShowing()) {
            lq0Var.m0.d(true);
        }
    }
}
