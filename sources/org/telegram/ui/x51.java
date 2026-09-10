package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x51 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ l71 d;

    public /* synthetic */ x51(l71 l71Var, int i10) {
        this.c = i10;
        this.d = l71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                l71 l71Var = this.d;
                return (l71Var.w0.indexOfKey(i10) >= 0 || l71Var.z0.indexOfKey(i10) >= 0 || i10 == l71Var.f || i10 == l71Var.y || i10 == l71Var.n || i10 == l71Var.h || i10 == l71Var.v || i10 == l71Var.a || i10 == l71Var.x) ? l71Var.r0.J : ((i10 < l71Var.E || i10 >= l71Var.F) && !l71Var.Q) ? 5 : 8;
            default:
                l71 l71Var2 = this.d;
                v61 v61Var = l71Var2.q0;
                int j3 = v61Var.j(i10);
                if (j3 == 6) {
                    return l71Var2.r0.J;
                }
                if (j3 != 5) {
                    l71 l71Var3 = v61Var.s;
                    if (l71Var3.W != 14 ? i10 <= (i11 = v61Var.c) || (i10 - i11) - 1 >= l71Var3.C1.size() : (arrayList = l71Var3.B1) == null || i10 < (i12 = v61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
