package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class zm extends pf.c {
    public final /* synthetic */ org.telegram.ui.Cells.t1 d;
    public final /* synthetic */ dn e;

    public zm(dn dnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = dnVar;
        this.d = t1Var;
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
        dn dnVar = this.e;
        sn snVar = dnVar.a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        snVar.Jb = t1Var.getMessageObject().getId();
        sn snVar2 = dnVar.a;
        snVar2.Kb = 2;
        snVar2.Lb = null;
        t1Var.invalidate();
    }
}
