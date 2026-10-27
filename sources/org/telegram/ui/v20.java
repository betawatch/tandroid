package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v20 extends g.o {
    public final /* synthetic */ x50 c;

    public v20(x50 x50Var) {
        this.c = x50Var;
    }

    @Override // g.o
    public final int i(int i10) {
        r50 r50Var;
        int i11;
        int i12;
        int i13 = x50.F3 ? 6 : 2;
        if (x50.G3 || i10 < (i11 = (r50Var = this.c.P).G) || i10 >= (i12 = r50Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!x50.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!x50.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
