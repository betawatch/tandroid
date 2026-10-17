package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xp0 implements org.telegram.ui.Components.e5, org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq0 b;

    public /* synthetic */ xp0(kq0 kq0Var, int i10) {
        this.a = i10;
        this.b = kq0Var;
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
        kq0 kq0Var = this.b;
        if (kq0Var.Y) {
            kq0Var.a0(view, kq0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.s5)) {
            return false;
        }
        org.telegram.ui.Components.km0 km0Var = kq0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
        kq0Var.X = z10;
        km0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        kq0 kq0Var = this.b;
        oq0 oq0Var = kq0Var.t0;
        if (oq0Var == null) {
            kq0Var.Z();
            return;
        }
        switch (oq0Var.a) {
            case 0:
                pq0 pq0Var = oq0Var.b;
                pq0Var.a.Z();
                pq0Var.b.Z();
                break;
            default:
                pq0 pq0Var2 = oq0Var.b;
                pq0Var2.a.Z();
                pq0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        kq0 kq0Var = this.b;
        kq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = kq0Var.m0) != null && m1Var.isShowing()) {
            kq0Var.m0.d(true);
        }
    }
}
