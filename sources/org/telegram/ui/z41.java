package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z41 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ q61 d;

    public /* synthetic */ z41(q61 q61Var, int i10) {
        this.c = i10;
        this.d = q61Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                q61 q61Var = this.d;
                return (q61Var.t0.indexOfKey(i10) >= 0 || q61Var.w0.indexOfKey(i10) >= 0 || i10 == q61Var.f || i10 == q61Var.y || i10 == q61Var.n || i10 == q61Var.h || i10 == q61Var.v || i10 == q61Var.a || i10 == q61Var.x) ? q61Var.o0.J : ((i10 < q61Var.B || i10 >= q61Var.C) && !q61Var.N) ? 5 : 8;
            default:
                q61 q61Var2 = this.d;
                z51 z51Var = q61Var2.n0;
                int j10 = z51Var.j(i10);
                if (j10 == 6) {
                    return q61Var2.o0.J;
                }
                if (j10 != 5) {
                    q61 q61Var3 = z51Var.s;
                    if (q61Var3.T != 14 ? i10 <= (i11 = z51Var.c) || (i10 - i11) - 1 >= q61Var3.z1.size() : (arrayList = q61Var3.y1) == null || i10 < (i12 = z51Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
