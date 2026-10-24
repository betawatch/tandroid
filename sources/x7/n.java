package x7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class n extends o {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ o e;

    public n(o oVar, int i10, int i11) {
        this.e = oVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w7.n8.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // x7.k
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // x7.k
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // x7.k
    public final Object[] o() {
        return this.e.o();
    }

    @Override // x7.o, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final o subList(int i10, int i11) {
        w7.n8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
