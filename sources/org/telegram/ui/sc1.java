package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ uc1 a;

    public sc1(uc1 uc1Var) {
        this.a = uc1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        uc1 uc1Var = this.a;
        org.telegram.messenger.zi ziVar = uc1Var.n;
        if (i3 == -1) {
            uc1Var.finishFragment();
            return;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                uc1.a0(uc1Var.d, ziVar, uc1Var.getParentActivity(), uc1Var.r, uc1Var.e);
            }
        } else if (ziVar != null) {
            ziVar.k.with_my_score = false;
            uc1Var.showDialog(org.telegram.ui.Components.oo0.N0(uc1Var.getParentActivity(), ziVar, null, false, uc1Var.h));
        }
    }
}
