package z7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class h extends i {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ i e;

    public h(i iVar, int i10, int i11) {
        this.e = iVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w7.h9.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // z7.e
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // z7.e
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // z7.e
    public final Object[] o() {
        return this.e.o();
    }

    @Override // z7.i, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final i subList(int i10, int i11) {
        w7.h9.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
