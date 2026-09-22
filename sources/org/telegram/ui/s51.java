package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class s51 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ h71 d;

    public /* synthetic */ s51(h71 h71Var, int i10) {
        this.c = i10;
        this.d = h71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                h71 h71Var = this.d;
                return (h71Var.w0.indexOfKey(i10) >= 0 || h71Var.z0.indexOfKey(i10) >= 0 || i10 == h71Var.f || i10 == h71Var.y || i10 == h71Var.n || i10 == h71Var.h || i10 == h71Var.v || i10 == h71Var.a || i10 == h71Var.x) ? h71Var.r0.J : ((i10 < h71Var.E || i10 >= h71Var.F) && !h71Var.Q) ? 5 : 8;
            default:
                h71 h71Var2 = this.d;
                r61 r61Var = h71Var2.q0;
                int j3 = r61Var.j(i10);
                if (j3 == 6) {
                    return h71Var2.r0.J;
                }
                if (j3 != 5) {
                    h71 h71Var3 = r61Var.s;
                    if (h71Var3.W != 14 ? i10 <= (i11 = r61Var.c) || (i10 - i11) - 1 >= h71Var3.C1.size() : (arrayList = h71Var3.B1) == null || i10 < (i12 = r61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
