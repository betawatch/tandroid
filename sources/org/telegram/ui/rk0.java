package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rk0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ dl0 a;

    public rk0(dl0 dl0Var) {
        this.a = dl0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        dl0 dl0Var = this.a;
        if (i3 == -1) {
            if (dl0Var.Q0) {
                return;
            }
            dl0Var.finishFragment();
            return;
        }
        if (i3 != 1 || dl0Var.Q0) {
            return;
        }
        if (dl0Var.v0 != 3) {
            org.telegram.messenger.g0.v1(dl0Var.getParentActivity().getCurrentFocus());
        }
        int i10 = dl0Var.v0;
        if (i10 == 0) {
            dl0Var.J0(true);
            dl0.r0(dl0Var);
            return;
        }
        int i11 = 0;
        if (i10 == 1) {
            while (true) {
                org.telegram.ui.Cells.h6[] h6VarArr = dl0Var.h;
                if (i11 >= h6VarArr.length) {
                    break;
                }
                if (h6VarArr[i11].b.f) {
                    dl0Var.H0 = dl0Var.F0.shipping_options.get(i11);
                    break;
                }
                i11++;
            }
            dl0Var.z0();
            return;
        }
        if (i10 == 2) {
            dl0.o0(dl0Var);
        } else if (i10 == 3) {
            dl0.p0(dl0Var);
        } else {
            if (i10 != 6) {
                return;
            }
            dl0Var.G0(false);
        }
    }
}
