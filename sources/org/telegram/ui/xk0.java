package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class xk0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ jl0 a;

    public xk0(jl0 jl0Var) {
        this.a = jl0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        jl0 jl0Var = this.a;
        if (i7 == -1) {
            if (jl0Var.Q0) {
                return;
            }
            jl0Var.finishFragment();
            return;
        }
        if (i7 != 1 || jl0Var.Q0) {
            return;
        }
        if (jl0Var.v0 != 3) {
            org.telegram.messenger.g0.v1(jl0Var.getParentActivity().getCurrentFocus());
        }
        int i10 = jl0Var.v0;
        if (i10 == 0) {
            jl0Var.J0(true);
            jl0.r0(jl0Var);
            return;
        }
        int i11 = 0;
        if (i10 == 1) {
            while (true) {
                org.telegram.ui.Cells.h6[] h6VarArr = jl0Var.h;
                if (i11 >= h6VarArr.length) {
                    break;
                }
                if (h6VarArr[i11].b.f) {
                    jl0Var.H0 = jl0Var.F0.shipping_options.get(i11);
                    break;
                }
                i11++;
            }
            jl0Var.z0();
            return;
        }
        if (i10 == 2) {
            jl0.o0(jl0Var);
        } else if (i10 == 3) {
            jl0.p0(jl0Var);
        } else {
            if (i10 != 6) {
                return;
            }
            jl0Var.G0(false);
        }
    }
}
