// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r5e extends x5e {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ x5e w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5e(x5e x5eVar, int i, int i2) {
        super((byte) 5);
        this.w = x5eVar;
        this.r = i;
        this.s = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        r3f.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override // l1d
    public final int q() {
        return this.w.s() + this.r + this.s;
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
    public final Object[] x() {
        return this.w.x();
    }

    @Override // x5e, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final x5e subList(int i, int i2) {
        r3f.c(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
