package x7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        w7.m8.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // x7.k
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // x7.k
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // x7.k
    public final Object[] p() {
        return this.e.p();
    }

    @Override // x7.o, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final o subList(int i10, int i11) {
        w7.m8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
