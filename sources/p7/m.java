package p7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends n {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ n e;

    public m(n nVar, int i3, int i10) {
        this.e = nVar;
        this.c = i3;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        a.e(i3, this.d);
        return this.e.get(i3 + this.c);
    }

    @Override // p7.i
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // p7.i
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // p7.i
    public final Object[] l() {
        return this.e.l();
    }

    @Override // p7.n, java.util.List
    /* renamed from: n */
    public final n subList(int i3, int i10) {
        a.m(i3, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i3 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
