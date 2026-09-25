package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class wp0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ cq0 a;

    public wp0(cq0 cq0Var) {
        this.a = cq0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        cq0 cq0Var = this.a;
        if (i10 == -1) {
            cq0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                cq0.U(cq0Var, null);
            }
        } else if (cq0Var.V != null) {
            cq0Var.finishFragment(false);
            cq0Var.V.b();
        }
    }
}
