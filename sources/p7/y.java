package p7;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y extends n {
    public static final y e = new y(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public y(int i3, Object[] objArr) {
        this.c = objArr;
        this.d = i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        a.e(i3, this.d);
        Object obj = this.c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p7.n, p7.i
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i3 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // p7.i
    public final int i() {
        return this.d;
    }

    @Override // p7.i
    public final int j() {
        return 0;
    }

    @Override // p7.i
    public final Object[] l() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
