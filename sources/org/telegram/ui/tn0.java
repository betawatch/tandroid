package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class tn0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ io0 a;

    public tn0(io0 io0Var) {
        this.a = io0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        io0 io0Var = this.a;
        if (i10 == -1) {
            if (io0Var.P0) {
                return;
            }
            io0Var.finishFragment();
            return;
        }
        if (i10 != 1 || io0Var.P0) {
            return;
        }
        if (io0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(io0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = io0Var.u0;
        if (i11 == 0) {
            io0Var.D0(true);
            io0.m0(io0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.k6[] k6VarArr = io0Var.h;
                if (i12 >= k6VarArr.length) {
                    break;
                }
                if (k6VarArr[i12].b.f) {
                    io0Var.G0 = io0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            io0Var.t0();
            return;
        }
        if (i11 == 2) {
            io0.j0(io0Var);
        } else if (i11 == 3) {
            io0.k0(io0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            io0Var.A0(false);
        }
    }
}
