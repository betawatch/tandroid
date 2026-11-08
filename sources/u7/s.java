package u7;

import c8.qc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class s extends r {
    public static final s e = new s(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public s(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // u7.r, u7.o
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        qc.a(i7, this.d);
        Object obj = this.c[i7];
        obj.getClass();
        return obj;
    }

    @Override // u7.o
    public final int i() {
        return this.d;
    }

    @Override // u7.o
    public final int j() {
        return 0;
    }

    @Override // u7.o
    public final boolean k() {
        return false;
    }

    @Override // u7.o
    public final Object[] l() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
