// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v8e extends x5e {
    public final transient Object[] r;
    public final transient boolean s;
    public final transient int w;

    /* JADX WARN: Multi-variable type inference failed */
    public v8e(int i, int i2, Object[] objArr) {
        super((byte) 5);
        this.r = objArr;
        this.s = i;
        this.w = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        r3f.a(i, this.w);
        Object obj = this.r[(i << 1) + (this.s ? 1 : 0)];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
