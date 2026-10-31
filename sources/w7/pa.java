package w7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class pa extends qa {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ qa e;

    public pa(qa qaVar, int i10, int i11) {
        this.e = qaVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        n8.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // w7.i9
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // w7.i9
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // w7.i9
    public final Object[] o() {
        return this.e.o();
    }

    @Override // w7.qa, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final qa subList(int i10, int i11) {
        n8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
