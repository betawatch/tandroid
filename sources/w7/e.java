package w7;

import j$.util.Objects;
import x7.o5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends d {
    public static final e e = new e(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public e(int i3, Object[] objArr) {
        this.c = objArr;
        this.d = i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        o5.a(i3, this.d);
        Object obj = this.c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // w7.d, w7.a
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i3 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // w7.a
    public final int i() {
        return this.d;
    }

    @Override // w7.a
    public final int j() {
        return 0;
    }

    @Override // w7.a
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
