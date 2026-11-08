package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
