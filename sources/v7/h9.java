package v7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class h9 extends i9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ i9 e;

    public h9(i9 i9Var, int i10, int i11) {
        this.e = i9Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w7.x7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // v7.f9
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // v7.f9
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // v7.f9
    public final Object[] p() {
        return this.e.p();
    }

    @Override // v7.i9, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final i9 subList(int i10, int i11) {
        w7.x7.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
