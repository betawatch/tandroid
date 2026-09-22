package v7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        w7.w7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // v7.e9
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // v7.e9
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // v7.e9
    public final Object[] p() {
        return this.e.p();
    }

    @Override // v7.h9, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final h9 subList(int i10, int i11) {
        w7.w7.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
