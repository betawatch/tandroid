// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class q04 extends zo {
    public final /* synthetic */ o24 c;

    public q04(o24 o24Var) {
        this.c = o24Var;
    }

    @Override // zo
    public final int i(int i) {
        o24 o24Var = this.c;
        y04 y04Var = o24Var.S;
        p04 p04Var = o24Var.R;
        j79 adapter = o24Var.Q.getAdapter();
        o14 o14Var = o24Var.T;
        if (adapter == o14Var) {
            int d = o14Var.d(i);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return p04Var.J;
            }
        } else if ((o24Var.e0 && i == 0) || i == y04Var.d || i == y04Var.c || i == y04Var.f || y04Var.r.indexOfKey(i) >= 0 || y04Var.w.indexOfKey(i) >= 0) {
            return p04Var.J;
        }
        return 1;
    }
}
