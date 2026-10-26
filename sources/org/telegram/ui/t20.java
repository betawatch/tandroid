package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t20 extends g.o {
    public final /* synthetic */ v50 c;

    public t20(v50 v50Var) {
        this.c = v50Var;
    }

    @Override // g.o
    public final int i(int i10) {
        p50 p50Var;
        int i11;
        int i12;
        int i13 = v50.F3 ? 6 : 2;
        if (v50.G3 || i10 < (i11 = (p50Var = this.c.P).G) || i10 >= (i12 = p50Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!v50.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!v50.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
