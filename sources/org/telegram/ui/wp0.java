package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wp0 implements org.telegram.ui.Components.e5, org.telegram.ui.Components.zl0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jq0 b;

    public /* synthetic */ wp0(jq0 jq0Var, int i10) {
        this.a = i10;
        this.b = jq0Var;
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

    @Override // org.telegram.ui.Components.zl0
    public boolean a(int i10, View view) {
        jq0 jq0Var = this.b;
        if (jq0Var.Y) {
            jq0Var.a0(view, jq0Var.J.photos.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.s5)) {
            return false;
        }
        org.telegram.ui.Components.lm0 lm0Var = jq0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
        jq0Var.X = z10;
        lm0Var.d(view, i10, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        jq0 jq0Var = this.b;
        nq0 nq0Var = jq0Var.t0;
        if (nq0Var == null) {
            jq0Var.Z();
            return;
        }
        switch (nq0Var.a) {
            case 0:
                oq0 oq0Var = nq0Var.b;
                oq0Var.a.Z();
                oq0Var.b.Z();
                break;
            default:
                oq0 oq0Var2 = nq0Var.b;
                oq0Var2.a.Z();
                oq0Var2.b.Z();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        jq0 jq0Var = this.b;
        jq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = jq0Var.m0) != null && m1Var.isShowing()) {
            jq0Var.m0.d(true);
        }
    }
}
