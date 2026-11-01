package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s11 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ g31 d;

    public /* synthetic */ s11(g31 g31Var, int i10) {
        this.c = i10;
        this.d = g31Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                g31 g31Var = this.d;
                return (g31Var.w0.indexOfKey(i10) >= 0 || g31Var.z0.indexOfKey(i10) >= 0 || i10 == g31Var.f || i10 == g31Var.D || i10 == g31Var.n || i10 == g31Var.h || i10 == g31Var.w || i10 == g31Var.a || i10 == g31Var.y) ? g31Var.r0.J : ((i10 < g31Var.E || i10 >= g31Var.F) && !g31Var.Q) ? 5 : 8;
            default:
                g31 g31Var2 = this.d;
                r21 r21Var = g31Var2.q0;
                int d = r21Var.d(i10);
                if (d == 6) {
                    return g31Var2.r0.J;
                }
                if (d != 5) {
                    g31 g31Var3 = r21Var.s;
                    if (g31Var3.W != 14 ? i10 <= (i11 = r21Var.c) || (i10 - i11) - 1 >= g31Var3.D1.size() : (arrayList = g31Var3.C1) == null || i10 < (i12 = r21Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
