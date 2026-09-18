package z7;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        w7.m9.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // z7.e
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // z7.e
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // z7.e
    public final Object[] p() {
        return this.e.p();
    }

    @Override // z7.i, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final i subList(int i10, int i11) {
        w7.m9.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
