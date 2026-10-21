package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ym extends pf.c {
    public final /* synthetic */ org.telegram.ui.Cells.u1 d;
    public final /* synthetic */ cn e;

    public ym(cn cnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = cnVar;
        this.d = u1Var;
    }

    @Override // pf.c
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new tj(this.e.a, 9), 250L);
    }

    @Override // pf.c
    public final void d() {
        cn cnVar = this.e;
        qn qnVar = cnVar.a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        qnVar.wb = u1Var.getMessageObject().getId();
        qn qnVar2 = cnVar.a;
        qnVar2.xb = 2;
        qnVar2.yb = null;
        u1Var.invalidate();
    }
}
