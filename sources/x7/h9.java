package x7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h9 extends i9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ i9 e;

    public h9(i9 i9Var, int i3, int i10) {
        this.e = i9Var;
        this.c = i3;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        w5.a(i3, this.d);
        return this.e.get(i3 + this.c);
    }

    @Override // x7.f9
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // x7.f9
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // x7.f9
    public final Object[] k() {
        return this.e.k();
    }

    @Override // x7.i9, java.util.List
    /* renamed from: l */
    public final i9 subList(int i3, int i10) {
        w5.b(i3, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i3 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
