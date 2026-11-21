package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um0 implements org.telegram.ui.Components.a5, org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn0 b;

    public /* synthetic */ um0(cn0 cn0Var, int i7) {
        this.a = i7;
        this.b = cn0Var;
    }

    @Override // org.telegram.ui.Components.a5
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

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        cn0 cn0Var = this.b;
        if (cn0Var.Z) {
            cn0Var.f0(view, cn0Var.K.e.get(i7));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.s5)) {
            return false;
        }
        org.telegram.ui.Components.ik0 ik0Var = cn0Var.W;
        boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
        cn0Var.Y = z10;
        ik0Var.d(i7, view, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        cn0 cn0Var = this.b;
        cn0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = cn0Var.n0) != null && g1Var.isShowing()) {
            cn0Var.n0.d(true);
        }
    }
}
