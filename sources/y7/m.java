package y7;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class m extends n {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ n e;

    public m(n nVar, int i10, int i11) {
        this.e = nVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w7.h5.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // y7.j
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // y7.j
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // y7.j
    public final Object[] o() {
        return this.e.o();
    }

    @Override // y7.n, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final n subList(int i10, int i11) {
        w7.h5.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
