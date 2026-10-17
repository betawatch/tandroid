package t7;

import w7.r7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class c extends d {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // t7.a
    public final int m() {
        return this.e.n() + this.c + this.d;
    }

    @Override // t7.a
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // t7.a
    public final Object[] o() {
        return this.e.o();
    }

    @Override // t7.d, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final d subList(int i10, int i11) {
        r7.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
