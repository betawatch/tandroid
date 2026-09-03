package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qp0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ wp0 a;

    public qp0(wp0 wp0Var) {
        this.a = wp0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        wp0 wp0Var = this.a;
        if (i10 == -1) {
            wp0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                wp0.U(wp0Var, null);
            }
        } else if (wp0Var.S != null) {
            wp0Var.finishFragment(false);
            wp0Var.S.b();
        }
    }
}
