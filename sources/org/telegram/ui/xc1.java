package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class xc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ zc1 a;

    public xc1(zc1 zc1Var) {
        this.a = zc1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        zc1 zc1Var = this.a;
        org.telegram.messenger.ij ijVar = zc1Var.n;
        if (i7 == -1) {
            zc1Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                zc1.a0(zc1Var.d, ijVar, zc1Var.getParentActivity(), zc1Var.r, zc1Var.e);
            }
        } else if (ijVar != null) {
            ijVar.k.with_my_score = false;
            zc1Var.showDialog(org.telegram.ui.Components.mo0.N0(zc1Var.getParentActivity(), ijVar, null, false, zc1Var.h));
        }
    }
}
