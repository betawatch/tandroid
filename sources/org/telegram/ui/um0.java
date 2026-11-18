package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class um0 implements org.telegram.ui.Components.z4, org.telegram.ui.Components.qj0, org.telegram.ui.ActionBar.f1, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn0 b;

    public /* synthetic */ um0(cn0 cn0Var, int i7) {
        this.a = i7;
        this.b = cn0Var;
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.j0(i7, z10);
                break;
            default:
                this.b.j0(i7, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        cn0 cn0Var = this.b;
        if (cn0Var.Z) {
            cn0Var.f0(view, cn0Var.K.e.get(i7));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.r5)) {
            return false;
        }
        org.telegram.ui.Components.gk0 gk0Var = cn0Var.W;
        boolean z10 = !((org.telegram.ui.Cells.r5) view).a();
        cn0Var.Y = z10;
        gk0Var.d(i7, view, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        cn0 cn0Var = this.b;
        dn0 dn0Var = cn0Var.u0;
        if (dn0Var == null) {
            cn0Var.e0();
            return;
        }
        switch (dn0Var.a) {
            case 1:
                fn0 fn0Var = dn0Var.b;
                fn0Var.a.e0();
                fn0Var.b.e0();
                break;
            default:
                fn0 fn0Var2 = dn0Var.b;
                fn0Var2.a.e0();
                fn0Var2.b.e0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        cn0 cn0Var = this.b;
        cn0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var = cn0Var.n0) != null && h1Var.isShowing()) {
            cn0Var.n0.d(true);
        }
    }
}
