package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u11 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ i31 d;

    public /* synthetic */ u11(i31 i31Var, int i10) {
        this.c = i10;
        this.d = i31Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                i31 i31Var = this.d;
                return (i31Var.w0.indexOfKey(i10) >= 0 || i31Var.z0.indexOfKey(i10) >= 0 || i10 == i31Var.f || i10 == i31Var.D || i10 == i31Var.n || i10 == i31Var.h || i10 == i31Var.w || i10 == i31Var.a || i10 == i31Var.y) ? i31Var.r0.J : ((i10 < i31Var.E || i10 >= i31Var.F) && !i31Var.Q) ? 5 : 8;
            default:
                i31 i31Var2 = this.d;
                t21 t21Var = i31Var2.q0;
                int d = t21Var.d(i10);
                if (d == 6) {
                    return i31Var2.r0.J;
                }
                if (d != 5) {
                    i31 i31Var3 = t21Var.s;
                    if (i31Var3.W != 14 ? i10 <= (i11 = t21Var.c) || (i10 - i11) - 1 >= i31Var3.D1.size() : (arrayList = i31Var3.C1) == null || i10 < (i12 = t21Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
