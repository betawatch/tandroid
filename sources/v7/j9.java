package v7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j9 extends h9 {
    public static final j9 e = new j9(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public j9(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w7.w7.a(i10, this.d);
        Object obj = this.c[i10];
        obj.getClass();
        return obj;
    }

    @Override // v7.h9, v7.e9
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // v7.e9
    public final int n() {
        return this.d;
    }

    @Override // v7.e9
    public final int o() {
        return 0;
    }

    @Override // v7.e9
    public final Object[] p() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
