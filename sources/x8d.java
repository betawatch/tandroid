// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class x8d extends v8d {
    public static final x8d w = new x8d(0, new Object[0]);
    public final transient Object[] r;
    public final transient boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    public x8d(int i, Object[] objArr) {
        super((byte) 1);
        this.r = objArr;
        this.s = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        q3f.a(i, this.s ? 1 : 0);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // v8d, b4d
    public final int l(Object[] objArr) {
        Object[] objArr2 = this.r;
        boolean z = this.s;
        System.arraycopy(objArr2, 0, objArr, 0, z ? 1 : 0);
        return z ? 1 : 0;
    }

    @Override // b4d
    public final int m() {
        return this.s ? 1 : 0;
    }

    @Override // b4d
    public final Object[] o() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s ? 1 : 0;
    }
}
