package x7;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class sa extends ta {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ ta e;

    public sa(ta taVar, int i10, int i11) {
        this.e = taVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w7.c0.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // x7.l9
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // x7.l9
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // x7.l9
    public final Object[] o() {
        return this.e.o();
    }

    @Override // x7.ta, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final ta subList(int i10, int i11) {
        w7.c0.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
