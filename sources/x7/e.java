package x7;

import c8.ld;
import j$.util.Objects;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e extends d {
    public static final e e = new e(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public e(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // x7.d, x7.a
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        ld.a(i7, this.d);
        Object obj = this.c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // x7.a
    public final int i() {
        return this.d;
    }

    @Override // x7.a
    public final int j() {
        return 0;
    }

    @Override // x7.a
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
