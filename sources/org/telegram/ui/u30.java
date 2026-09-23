package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class u30 extends s4.j {
    public final /* synthetic */ f60 F;

    public u30(f60 f60Var) {
        this.F = f60Var;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        f60 f60Var = this.F;
        f60Var.Q.invalidate();
        f60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.invalidate();
        f60.J0(f60Var);
    }
}
