package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class vk0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ hl0 a;

    public vk0(hl0 hl0Var) {
        this.a = hl0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        hl0 hl0Var = this.a;
        if (i7 == -1) {
            if (hl0Var.P0) {
                return;
            }
            hl0Var.finishFragment();
            return;
        }
        if (i7 != 1 || hl0Var.P0) {
            return;
        }
        if (hl0Var.u0 != 3) {
            org.telegram.messenger.g0.v1(hl0Var.getParentActivity().getCurrentFocus());
        }
        int i10 = hl0Var.u0;
        if (i10 == 0) {
            hl0Var.J0(true);
            hl0.r0(hl0Var);
            return;
        }
        int i11 = 0;
        if (i10 == 1) {
            while (true) {
                org.telegram.ui.Cells.i6[] i6VarArr = hl0Var.h;
                if (i11 >= i6VarArr.length) {
                    break;
                }
                if (i6VarArr[i11].b.f) {
                    hl0Var.G0 = hl0Var.E0.shipping_options.get(i11);
                    break;
                }
                i11++;
            }
            hl0Var.z0();
            return;
        }
        if (i10 == 2) {
            hl0.o0(hl0Var);
        } else if (i10 == 3) {
            hl0.p0(hl0Var);
        } else {
            if (i10 != 6) {
                return;
            }
            hl0Var.G0(false);
        }
    }
}
