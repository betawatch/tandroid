package q8;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o0 extends c0 {
    public final transient b0 d;
    public final transient p0 e;

    public o0(b0 b0Var, p0 p0Var) {
        this.d = b0Var;
        this.e = p0Var;
    }

    @Override // q8.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // q8.c0, q8.u
    public final z i() {
        return this.e;
    }

    @Override // q8.u
    public final int n(int i10, Object[] objArr) {
        return this.e.n(i10, objArr);
    }

    @Override // q8.u
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((q0) this.d).f;
    }

    @Override // q8.c0
    /* renamed from: w */
    public final x0 iterator() {
        return this.e.listIterator(0);
    }
}
