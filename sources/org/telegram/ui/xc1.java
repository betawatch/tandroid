package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ zc1 a;

    public xc1(zc1 zc1Var) {
        this.a = zc1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        zc1 zc1Var = this.a;
        org.telegram.messenger.gj gjVar = zc1Var.n;
        if (i7 == -1) {
            zc1Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                zc1.a0(zc1Var.d, gjVar, zc1Var.getParentActivity(), zc1Var.r, zc1Var.e);
            }
        } else if (gjVar != null) {
            gjVar.k.with_my_score = false;
            zc1Var.showDialog(org.telegram.ui.Components.po0.N0(zc1Var.getParentActivity(), gjVar, null, false, zc1Var.h));
        }
    }
}
