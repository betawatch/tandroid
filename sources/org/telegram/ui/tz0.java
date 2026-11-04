package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tz0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ g11 d;

    public /* synthetic */ tz0(g11 g11Var, int i3) {
        this.c = i3;
        this.d = g11Var;
    }

    @Override // g.p
    public final int i(int i3) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.c) {
            case 0:
                g11 g11Var = this.d;
                return (g11Var.x0.indexOfKey(i3) >= 0 || g11Var.A0.indexOfKey(i3) >= 0 || i3 == g11Var.f || i3 == g11Var.E || i3 == g11Var.n || i3 == g11Var.h || i3 == g11Var.w || i3 == g11Var.a || i3 == g11Var.y) ? g11Var.s0.J : ((i3 < g11Var.F || i3 >= g11Var.G) && !g11Var.R) ? 5 : 8;
            default:
                g11 g11Var2 = this.d;
                r01 r01Var = g11Var2.r0;
                int d = r01Var.d(i3);
                if (d == 6) {
                    return g11Var2.s0.J;
                }
                if (d != 5) {
                    g11 g11Var3 = r01Var.s;
                    if (g11Var3.a0 != 14 ? i3 <= (i10 = r01Var.c) || (i3 - i10) - 1 >= g11Var3.E1.size() : (arrayList = g11Var3.D1) == null || i3 < (i11 = r01Var.c) || i3 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
