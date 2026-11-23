package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yk0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ kl0 a;

    public yk0(kl0 kl0Var) {
        this.a = kl0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        kl0 kl0Var = this.a;
        if (i7 == -1) {
            if (kl0Var.Q0) {
                return;
            }
            kl0Var.finishFragment();
            return;
        }
        if (i7 != 1 || kl0Var.Q0) {
            return;
        }
        if (kl0Var.v0 != 3) {
            org.telegram.messenger.g0.v1(kl0Var.getParentActivity().getCurrentFocus());
        }
        int i10 = kl0Var.v0;
        if (i10 == 0) {
            kl0Var.J0(true);
            kl0.r0(kl0Var);
            return;
        }
        int i11 = 0;
        if (i10 == 1) {
            while (true) {
                org.telegram.ui.Cells.i6[] i6VarArr = kl0Var.h;
                if (i11 >= i6VarArr.length) {
                    break;
                }
                if (i6VarArr[i11].b.f) {
                    kl0Var.H0 = kl0Var.F0.shipping_options.get(i11);
                    break;
                }
                i11++;
            }
            kl0Var.z0();
            return;
        }
        if (i10 == 2) {
            kl0.o0(kl0Var);
        } else if (i10 == 3) {
            kl0.p0(kl0Var);
        } else {
            if (i10 != 6) {
                return;
            }
            kl0Var.G0(false);
        }
    }
}
