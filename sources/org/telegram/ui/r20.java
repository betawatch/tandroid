package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class r20 extends g.o {
    public final /* synthetic */ u50 c;

    public r20(u50 u50Var) {
        this.c = u50Var;
    }

    @Override // g.o
    public final int i(int i10) {
        o50 o50Var;
        int i11;
        int i12;
        int i13 = u50.F3 ? 6 : 2;
        if (u50.G3 || i10 < (i11 = (o50Var = this.c.P).G) || i10 >= (i12 = o50Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!u50.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!u50.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
