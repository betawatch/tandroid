package w7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class ra extends sa {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ sa e;

    public ra(sa saVar, int i10, int i11) {
        this.e = saVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        e8.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // w7.k9
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // w7.k9
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // w7.k9
    public final Object[] o() {
        return this.e.o();
    }

    @Override // w7.sa, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final sa subList(int i10, int i11) {
        e8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
