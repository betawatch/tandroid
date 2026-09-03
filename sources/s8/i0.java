package s8;

import j$.util.Objects;
import k7.c7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i0 extends v {
    public static final i0 e = new i0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public i0(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c7.c(i10, this.d);
        Object obj = this.c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // s8.v, s8.q
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // s8.q
    public final Object[] o() {
        return this.c;
    }

    @Override // s8.q
    public final int p() {
        return this.d;
    }

    @Override // s8.q
    public final int q() {
        return 0;
    }

    @Override // s8.q
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
