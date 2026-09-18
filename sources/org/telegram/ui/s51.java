package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class s51 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ g71 d;

    public /* synthetic */ s51(g71 g71Var, int i10) {
        this.c = i10;
        this.d = g71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                g71 g71Var = this.d;
                return (g71Var.w0.indexOfKey(i10) >= 0 || g71Var.z0.indexOfKey(i10) >= 0 || i10 == g71Var.f || i10 == g71Var.y || i10 == g71Var.n || i10 == g71Var.h || i10 == g71Var.v || i10 == g71Var.a || i10 == g71Var.x) ? g71Var.r0.J : ((i10 < g71Var.E || i10 >= g71Var.F) && !g71Var.Q) ? 5 : 8;
            default:
                g71 g71Var2 = this.d;
                q61 q61Var = g71Var2.q0;
                int j3 = q61Var.j(i10);
                if (j3 == 6) {
                    return g71Var2.r0.J;
                }
                if (j3 != 5) {
                    g71 g71Var3 = q61Var.s;
                    if (g71Var3.W != 14 ? i10 <= (i11 = q61Var.c) || (i10 - i11) - 1 >= g71Var3.C1.size() : (arrayList = g71Var3.B1) == null || i10 < (i12 = q61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
