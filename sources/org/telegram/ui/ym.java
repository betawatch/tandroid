package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ym extends ve.d {
    public final /* synthetic */ org.telegram.ui.Cells.t1 d;
    public final /* synthetic */ cn e;

    public ym(cn cnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = cnVar;
        this.d = t1Var;
    }

    @Override // ve.d
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new oj(this.e.a, 8), 250L);
    }

    @Override // ve.d
    public final void d() {
        cn cnVar = this.e;
        qn qnVar = cnVar.a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        qnVar.sb = t1Var.getMessageObject().getId();
        qn qnVar2 = cnVar.a;
        qnVar2.tb = 2;
        qnVar2.ub = null;
        t1Var.invalidate();
    }
}
