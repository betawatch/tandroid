package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class x30 extends s4.j {
    public final /* synthetic */ h60 F;

    public x30(h60 h60Var) {
        this.F = h60Var;
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        h60 h60Var = this.F;
        h60Var.Q.invalidate();
        h60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.invalidate();
        h60.J0(h60Var);
    }
}
