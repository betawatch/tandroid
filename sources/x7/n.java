package x7;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
        w7.n8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
