// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uad extends t8d {
    public final transient Object[] r;
    public final transient boolean s;
    public final transient int w;

    /* JADX WARN: Multi-variable type inference failed */
    public uad(int i, int i2, Object[] objArr) {
        super((byte) 2);
        this.r = objArr;
        this.s = i;
        this.w = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m6f.a(i, this.w);
        Object obj = this.r[(i << 1) + (this.s ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
