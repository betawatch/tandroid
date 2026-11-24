// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p1d extends o1d {
    public static final p1d s = new p1d(new Object[0]);
    public final transient Object[] r;

    public p1d(Object[] objArr) {
        super((byte) 0);
        this.r = objArr;
    }

    @Override // java.util.List
    public final Object get(int i) {
        s0f.a(i, 0);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // o1d, l1d
    public final int h(Object[] objArr) {
        System.arraycopy(this.r, 0, objArr, 0, 0);
        return 0;
    }

    @Override // l1d
    public final Object[] k() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
