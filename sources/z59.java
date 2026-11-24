// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class z59 extends ym5 {
    public final transient qm5 d;
    public final transient a69 e;

    public z59(qm5 qm5Var, a69 a69Var) {
        this.d = qm5Var;
        this.e = a69Var;
    }

    @Override // gm5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // ym5, gm5
    public final mm5 h() {
        return this.e;
    }

    @Override // gm5
    public final int i(int i, Object[] objArr) {
        return this.e.i(i, objArr);
    }

    @Override // gm5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final v5c iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }
}
