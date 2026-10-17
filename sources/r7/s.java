package r7;

import w7.a7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class s extends t {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ t e;

    public s(t tVar, int i10, int i11) {
        this.e = tVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // r7.q
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // r7.q
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // r7.q
    public final boolean o() {
        return true;
    }

    @Override // r7.q
    public final Object[] p() {
        return this.e.p();
    }

    @Override // r7.t, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final t subList(int i10, int i11) {
        a7.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
