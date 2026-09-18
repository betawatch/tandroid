package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u51 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ i71 d;

    public /* synthetic */ u51(i71 i71Var, int i10) {
        this.c = i10;
        this.d = i71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                i71 i71Var = this.d;
                return (i71Var.w0.indexOfKey(i10) >= 0 || i71Var.z0.indexOfKey(i10) >= 0 || i10 == i71Var.f || i10 == i71Var.y || i10 == i71Var.n || i10 == i71Var.h || i10 == i71Var.v || i10 == i71Var.a || i10 == i71Var.x) ? i71Var.r0.J : ((i10 < i71Var.E || i10 >= i71Var.F) && !i71Var.Q) ? 5 : 8;
            default:
                i71 i71Var2 = this.d;
                s61 s61Var = i71Var2.q0;
                int j3 = s61Var.j(i10);
                if (j3 == 6) {
                    return i71Var2.r0.J;
                }
                if (j3 != 5) {
                    i71 i71Var3 = s61Var.s;
                    if (i71Var3.W != 14 ? i10 <= (i11 = s61Var.c) || (i10 - i11) - 1 >= i71Var3.C1.size() : (arrayList = i71Var3.B1) == null || i10 < (i12 = s61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
