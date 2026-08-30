package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vn0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ jo0 a;

    public vn0(jo0 jo0Var) {
        this.a = jo0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        jo0 jo0Var = this.a;
        if (i10 == -1) {
            if (jo0Var.M0) {
                return;
            }
            jo0Var.finishFragment();
            return;
        }
        if (i10 != 1 || jo0Var.M0) {
            return;
        }
        if (jo0Var.r0 != 3) {
            AndroidUtilities.hideKeyboard(jo0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = jo0Var.r0;
        if (i11 == 0) {
            jo0Var.D0(true);
            jo0.m0(jo0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.j6[] j6VarArr = jo0Var.h;
                if (i12 >= j6VarArr.length) {
                    break;
                }
                if (j6VarArr[i12].b.f) {
                    jo0Var.D0 = jo0Var.B0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            jo0Var.t0();
            return;
        }
        if (i11 == 2) {
            jo0.j0(jo0Var);
        } else if (i11 == 3) {
            jo0.k0(jo0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            jo0Var.A0(false);
        }
    }
}
