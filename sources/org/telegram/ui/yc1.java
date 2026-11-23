package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ad1 a;

    public yc1(ad1 ad1Var) {
        this.a = ad1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        ad1 ad1Var = this.a;
        org.telegram.messenger.fj fjVar = ad1Var.n;
        if (i7 == -1) {
            ad1Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                ad1.a0(ad1Var.d, fjVar, ad1Var.getParentActivity(), ad1Var.r, ad1Var.e);
            }
        } else if (fjVar != null) {
            fjVar.k.with_my_score = false;
            ad1Var.showDialog(org.telegram.ui.Components.zo0.O0(ad1Var.getParentActivity(), fjVar, null, false, ad1Var.h));
        }
    }
}
