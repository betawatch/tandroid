package v7;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class g9 extends h9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ h9 e;

    public g9(h9 h9Var, int i10, int i11) {
        this.e = h9Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w7.c8.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // v7.e9
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // v7.e9
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // v7.e9
    public final Object[] o() {
        return this.e.o();
    }

    @Override // v7.h9, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final h9 subList(int i10, int i11) {
        w7.c8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
