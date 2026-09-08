package w7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        a8.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // w7.k9
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // w7.k9
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // w7.k9
    public final Object[] p() {
        return this.e.p();
    }

    @Override // w7.sa, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final sa subList(int i10, int i11) {
        a8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
