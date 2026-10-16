package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq0 implements org.telegram.ui.Components.f5, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr0 b;

    public /* synthetic */ sq0(fr0 fr0Var, int i10) {
        this.a = i10;
        this.b = fr0Var;
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
        fr0 fr0Var = this.b;
        if (fr0Var.Y) {
            fr0Var.a0(view, fr0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.om0 om0Var = fr0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
        fr0Var.X = z10;
        om0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        fr0 fr0Var = this.b;
        jr0 jr0Var = fr0Var.t0;
        if (jr0Var == null) {
            fr0Var.Z();
            return;
        }
        switch (jr0Var.a) {
            case 0:
                kr0 kr0Var = jr0Var.b;
                kr0Var.a.Z();
                kr0Var.b.Z();
                break;
            default:
                kr0 kr0Var2 = jr0Var.b;
                kr0Var2.a.Z();
                kr0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        fr0 fr0Var = this.b;
        fr0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = fr0Var.m0) != null && m1Var.isShowing()) {
            fr0Var.m0.d(true);
        }
    }
}
