package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class zn0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ oo0 a;

    public zn0(oo0 oo0Var) {
        this.a = oo0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        oo0 oo0Var = this.a;
        if (i10 == -1) {
            if (oo0Var.P0) {
                return;
            }
            oo0Var.finishFragment();
            return;
        }
        if (i10 != 1 || oo0Var.P0) {
            return;
        }
        if (oo0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(oo0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = oo0Var.u0;
        if (i11 == 0) {
            oo0Var.D0(true);
            oo0.m0(oo0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.k6[] k6VarArr = oo0Var.h;
                if (i12 >= k6VarArr.length) {
                    break;
                }
                if (k6VarArr[i12].b.f) {
                    oo0Var.G0 = oo0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            oo0Var.t0();
            return;
        }
        if (i11 == 2) {
            oo0.j0(oo0Var);
        } else if (i11 == 3) {
            oo0.k0(oo0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            oo0Var.A0(false);
        }
    }
}
