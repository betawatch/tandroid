package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class x30 extends s4.j {
    public final /* synthetic */ j60 F;

    public x30(j60 j60Var) {
        this.F = j60Var;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        j60 j60Var = this.F;
        j60Var.Q.invalidate();
        j60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.invalidate();
        j60.J0(j60Var);
    }
}
