package p4;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ u0(b1 b1Var, int i7) {
        this.a = i7;
        this.b = b1Var;
    }

    @Override // p4.b1
    public final Object j(d0 d0Var, v vVar, int i7) {
        switch (this.a) {
            case 0:
                if (d0Var != null) {
                    throw new ClassCastException();
                }
                d1.k1(null, vVar, i7, this.b, new ai.n1(vVar, i7, 20));
                throw null;
            default:
                return d1.k1(d0Var, vVar, i7, this.b, new ai.o1(d0Var, vVar, i7, 19));
        }
    }
}
