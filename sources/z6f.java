// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z6f extends h9f {
    public final transient int h;
    public final transient int n;
    public final /* synthetic */ h9f r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6f(h9f h9fVar, int i, int i2) {
        super((byte) 2);
        this.r = h9fVar;
        this.h = i;
        this.n = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        s3f.a(i, this.n);
        return this.r.get(i + this.h);
    }

    @Override // zad
    public final int i() {
        return this.r.j() + this.h + this.n;
    }

    @Override // zad
    public final int j() {
        return this.r.j() + this.h;
    }

    @Override // zad
    public final Object[] k() {
        return this.r.k();
    }

    @Override // h9f, java.util.List
    /* renamed from: l */
    public final h9f subList(int i, int i2) {
        s3f.b(i, i2, this.n);
        int i3 = this.h;
        return this.r.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
