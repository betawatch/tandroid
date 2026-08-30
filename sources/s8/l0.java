package s8;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l0 extends z {
    public final transient x d;
    public final transient m0 e;

    public l0(x xVar, m0 m0Var) {
        this.d = xVar;
        this.e = m0Var;
    }

    @Override // s8.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // s8.z, s8.q
    public final v i() {
        return this.e;
    }

    @Override // s8.q
    public final int n(int i10, Object[] objArr) {
        return this.e.n(i10, objArr);
    }

    @Override // s8.q
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((n0) this.d).f;
    }

    @Override // s8.z
    /* renamed from: w */
    public final u0 iterator() {
        return this.e.listIterator(0);
    }
}
