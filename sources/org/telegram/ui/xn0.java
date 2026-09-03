package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xn0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ lo0 a;

    public xn0(lo0 lo0Var) {
        this.a = lo0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        lo0 lo0Var = this.a;
        if (i10 == -1) {
            if (lo0Var.M0) {
                return;
            }
            lo0Var.finishFragment();
            return;
        }
        if (i10 != 1 || lo0Var.M0) {
            return;
        }
        if (lo0Var.r0 != 3) {
            AndroidUtilities.hideKeyboard(lo0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = lo0Var.r0;
        if (i11 == 0) {
            lo0Var.D0(true);
            lo0.m0(lo0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.j6[] j6VarArr = lo0Var.h;
                if (i12 >= j6VarArr.length) {
                    break;
                }
                if (j6VarArr[i12].b.f) {
                    lo0Var.D0 = lo0Var.B0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            lo0Var.t0();
            return;
        }
        if (i11 == 2) {
            lo0.j0(lo0Var);
        } else if (i11 == 3) {
            lo0.k0(lo0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            lo0Var.A0(false);
        }
    }
}
