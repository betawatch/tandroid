package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class v51 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ k71 d;

    public /* synthetic */ v51(k71 k71Var, int i10) {
        this.c = i10;
        this.d = k71Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                k71 k71Var = this.d;
                return (k71Var.w0.indexOfKey(i10) >= 0 || k71Var.z0.indexOfKey(i10) >= 0 || i10 == k71Var.f || i10 == k71Var.y || i10 == k71Var.n || i10 == k71Var.h || i10 == k71Var.v || i10 == k71Var.a || i10 == k71Var.x) ? k71Var.r0.J : ((i10 < k71Var.E || i10 >= k71Var.F) && !k71Var.Q) ? 5 : 8;
            default:
                k71 k71Var2 = this.d;
                u61 u61Var = k71Var2.q0;
                int j3 = u61Var.j(i10);
                if (j3 == 6) {
                    return k71Var2.r0.J;
                }
                if (j3 != 5) {
                    k71 k71Var3 = u61Var.s;
                    if (k71Var3.W != 14 ? i10 <= (i11 = u61Var.c) || (i10 - i11) - 1 >= k71Var3.C1.size() : (arrayList = k71Var3.B1) == null || i10 < (i12 = u61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
