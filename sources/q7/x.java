package q7;

import j$.util.Objects;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class x extends m {
    public static final x e = new x(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public x(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // q7.m, q7.h
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a.e(i7, this.d);
        Object obj = this.c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // q7.h
    public final int i() {
        return this.d;
    }

    @Override // q7.h
    public final int j() {
        return 0;
    }

    @Override // q7.h
    public final Object[] l() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
