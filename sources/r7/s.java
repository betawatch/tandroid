package r7;

import w7.w6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
        w6.a(i10, this.d);
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
        w6.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
