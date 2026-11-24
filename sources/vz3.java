// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vz3 extends yo {
    public final /* synthetic */ t14 c;

    public vz3(t14 t14Var) {
        this.c = t14Var;
    }

    @Override // yo
    public final int i(int i) {
        t14 t14Var = this.c;
        d04 d04Var = t14Var.S;
        uz3 uz3Var = t14Var.R;
        w39 adapter = t14Var.Q.getAdapter();
        t04 t04Var = t14Var.T;
        if (adapter == t04Var) {
            int d = t04Var.d(i);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return uz3Var.J;
            }
        } else if ((t14Var.e0 && i == 0) || i == d04Var.d || i == d04Var.c || i == d04Var.f || d04Var.r.indexOfKey(i) >= 0 || d04Var.w.indexOfKey(i) >= 0) {
            return uz3Var.J;
        }
        return 1;
    }
}
