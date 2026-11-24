// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w8d extends c9d {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ c9d w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8d(c9d c9dVar, int i, int i2) {
        super((byte) 3);
        this.w = c9dVar;
        this.r = i;
        this.s = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        w5f.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override // l1d
    public final Object[] r() {
        return this.w.r();
    }

    @Override // l1d
    public final int s() {
        return this.w.s() + this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // l1d
    public final int t() {
        return this.w.s() + this.r + this.s;
    }

    @Override // c9d, java.util.List
    /* renamed from: z */
    public final c9d subList(int i, int i2) {
        w5f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
