package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class rn0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ go0 a;

    public rn0(go0 go0Var) {
        this.a = go0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        go0 go0Var = this.a;
        if (i10 == -1) {
            if (go0Var.P0) {
                return;
            }
            go0Var.finishFragment();
            return;
        }
        if (i10 != 1 || go0Var.P0) {
            return;
        }
        if (go0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(go0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = go0Var.u0;
        if (i11 == 0) {
            go0Var.D0(true);
            go0.m0(go0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.j6[] j6VarArr = go0Var.h;
                if (i12 >= j6VarArr.length) {
                    break;
                }
                if (j6VarArr[i12].b.f) {
                    go0Var.G0 = go0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            go0Var.t0();
            return;
        }
        if (i11 == 2) {
            go0.j0(go0Var);
        } else if (i11 == 3) {
            go0.k0(go0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            go0Var.A0(false);
        }
    }
}
