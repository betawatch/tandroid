package x7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s extends o {
    public static final s e = new s(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public s(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w7.v8.a(i10, this.d);
        Object obj = this.c[i10];
        obj.getClass();
        return obj;
    }

    @Override // x7.o, x7.k
    public final int l(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // x7.k
    public final int m() {
        return this.d;
    }

    @Override // x7.k
    public final int n() {
        return 0;
    }

    @Override // x7.k
    public final Object[] o() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
