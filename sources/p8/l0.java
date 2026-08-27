package p8;

import j$.util.Objects;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l0 extends z {
    public static final l0 e = new l0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public l0(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        h7.f0.b(i10, this.d);
        Object obj = this.c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p8.z, p8.u
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // p8.u
    public final Object[] o() {
        return this.c;
    }

    @Override // p8.u
    public final int p() {
        return this.d;
    }

    @Override // p8.u
    public final int q() {
        return 0;
    }

    @Override // p8.u
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
