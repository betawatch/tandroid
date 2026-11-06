package z7;

import c8.he;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class sa extends ta {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ ta e;

    public sa(ta taVar, int i7, int i10) {
        this.e = taVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        he.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // z7.l9
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // z7.l9
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // z7.l9
    public final Object[] k() {
        return this.e.k();
    }

    @Override // z7.ta, java.util.List
    /* renamed from: l */
    public final ta subList(int i7, int i10) {
        he.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
