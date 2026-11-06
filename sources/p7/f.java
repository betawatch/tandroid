package p7;

import c8.cb;
import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends e {
    public static final f e = new f(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public f(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // p7.a
    public final Object[] f() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        cb.a(i7, this.d);
        Object obj = this.c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p7.a
    public final int i() {
        return 0;
    }

    @Override // p7.a
    public final int j() {
        return this.d;
    }

    @Override // p7.e, p7.a
    public final int k(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
