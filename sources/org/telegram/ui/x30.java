package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
