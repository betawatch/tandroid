package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq0 implements org.telegram.ui.Components.f5, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hr0 b;

    public /* synthetic */ uq0(hr0 hr0Var, int i10) {
        this.a = i10;
        this.b = hr0Var;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.e0(i10, z10);
                break;
            default:
                this.b.e0(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        hr0 hr0Var = this.b;
        if (hr0Var.Y) {
            hr0Var.a0(view, hr0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.om0 om0Var = hr0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
        hr0Var.X = z10;
        om0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        hr0 hr0Var = this.b;
        lr0 lr0Var = hr0Var.t0;
        if (lr0Var == null) {
            hr0Var.Z();
            return;
        }
        switch (lr0Var.a) {
            case 0:
                mr0 mr0Var = lr0Var.b;
                mr0Var.a.Z();
                mr0Var.b.Z();
                break;
            default:
                mr0 mr0Var2 = lr0Var.b;
                mr0Var2.a.Z();
                mr0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        hr0 hr0Var = this.b;
        hr0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = hr0Var.m0) != null && m1Var.isShowing()) {
            hr0Var.m0.d(true);
        }
    }
}
