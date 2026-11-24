// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vka extends yo5 {
    public final transient Object d;

    public vka(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // go5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // yo5, go5
    public final mo5 h() {
        return mo5.u(this.d);
    }

    @Override // yo5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // go5
    public final int i(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // go5
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final v7c iterator() {
        return new mu5(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
