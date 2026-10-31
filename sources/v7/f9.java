package v7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f9 extends g9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ g9 e;

    public f9(g9 g9Var, int i10, int i11) {
        this.e = g9Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w7.h8.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // v7.d9
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // v7.d9
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // v7.d9
    public final Object[] o() {
        return this.e.o();
    }

    @Override // v7.g9, java.util.List
    /* renamed from: p */
    public final g9 subList(int i10, int i11) {
        w7.h8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
