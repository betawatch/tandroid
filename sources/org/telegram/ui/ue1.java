package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ue1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ we1 a;

    public ue1(we1 we1Var) {
        this.a = we1Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        we1 we1Var = this.a;
        org.telegram.messenger.jj jjVar = we1Var.n;
        if (i10 == -1) {
            we1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                we1.Z(we1Var.d, jjVar, we1Var.getParentActivity(), we1Var.r, we1Var.e);
            }
        } else if (jjVar != null) {
            jjVar.k.with_my_score = false;
            we1Var.showDialog(org.telegram.ui.Components.op0.N0(we1Var.getParentActivity(), jjVar, null, false, we1Var.h));
        }
    }
}
