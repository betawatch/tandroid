package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class qn0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ fo0 a;

    public qn0(fo0 fo0Var) {
        this.a = fo0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        fo0 fo0Var = this.a;
        if (i10 == -1) {
            if (fo0Var.P0) {
                return;
            }
            fo0Var.finishFragment();
            return;
        }
        if (i10 != 1 || fo0Var.P0) {
            return;
        }
        if (fo0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(fo0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = fo0Var.u0;
        if (i11 == 0) {
            fo0Var.D0(true);
            fo0.m0(fo0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.j6[] j6VarArr = fo0Var.h;
                if (i12 >= j6VarArr.length) {
                    break;
                }
                if (j6VarArr[i12].b.f) {
                    fo0Var.G0 = fo0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            fo0Var.t0();
            return;
        }
        if (i11 == 2) {
            fo0.j0(fo0Var);
        } else if (i11 == 3) {
            fo0.k0(fo0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            fo0Var.A0(false);
        }
    }
}
