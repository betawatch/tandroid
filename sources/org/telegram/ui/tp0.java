package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp0 implements org.telegram.ui.Components.y4, org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.n1, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fq0 b;

    public /* synthetic */ tp0(fq0 fq0Var, int i10) {
        this.a = i10;
        this.b = fq0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 0:
                this.b.e0(i10, z4);
                break;
            default:
                this.b.e0(i10, z4);
                break;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        fq0 fq0Var = this.b;
        if (fq0Var.V) {
            fq0Var.a0(view, fq0Var.G.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.t5)) {
            return false;
        }
        org.telegram.ui.Components.vl0 vl0Var = fq0Var.S;
        boolean z4 = !((org.telegram.ui.Cells.t5) view).a();
        fq0Var.U = z4;
        vl0Var.d(view, i10, z4);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        fq0 fq0Var = this.b;
        jq0 jq0Var = fq0Var.q0;
        if (jq0Var == null) {
            fq0Var.Z();
            return;
        }
        switch (jq0Var.a) {
            case 0:
                kq0 kq0Var = jq0Var.b;
                kq0Var.a.Z();
                kq0Var.b.Z();
                break;
            default:
                kq0 kq0Var2 = jq0Var.b;
                kq0Var2.a.Z();
                kq0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        fq0 fq0Var = this.b;
        fq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = fq0Var.j0) != null && p1Var.isShowing()) {
            fq0Var.j0.d(true);
        }
    }
}
