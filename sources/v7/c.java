package v7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class c extends h9 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e = 1;

    public c(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w7.w7.a(i10, this.e);
        Object obj = this.c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
