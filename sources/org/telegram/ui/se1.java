package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class se1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ue1 a;

    public se1(ue1 ue1Var) {
        this.a = ue1Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        ue1 ue1Var = this.a;
        org.telegram.messenger.kj kjVar = ue1Var.n;
        if (i10 == -1) {
            ue1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                ue1.a0(ue1Var.d, kjVar, ue1Var.getParentActivity(), ue1Var.r, ue1Var.e);
            }
        } else if (kjVar != null) {
            kjVar.k.with_my_score = false;
            ue1Var.showDialog(org.telegram.ui.Components.pp0.N0(ue1Var.getParentActivity(), kjVar, null, false, ue1Var.h));
        }
    }
}
