package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class u51 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ j71 d;

    public /* synthetic */ u51(j71 j71Var, int i10) {
        this.c = i10;
        this.d = j71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                j71 j71Var = this.d;
                return (j71Var.w0.indexOfKey(i10) >= 0 || j71Var.z0.indexOfKey(i10) >= 0 || i10 == j71Var.f || i10 == j71Var.y || i10 == j71Var.n || i10 == j71Var.h || i10 == j71Var.v || i10 == j71Var.a || i10 == j71Var.x) ? j71Var.r0.J : ((i10 < j71Var.E || i10 >= j71Var.F) && !j71Var.Q) ? 5 : 8;
            default:
                j71 j71Var2 = this.d;
                t61 t61Var = j71Var2.q0;
                int j3 = t61Var.j(i10);
                if (j3 == 6) {
                    return j71Var2.r0.J;
                }
                if (j3 != 5) {
                    j71 j71Var3 = t61Var.s;
                    if (j71Var3.W != 14 ? i10 <= (i11 = t61Var.c) || (i10 - i11) - 1 >= j71Var3.C1.size() : (arrayList = j71Var3.B1) == null || i10 < (i12 = t61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
