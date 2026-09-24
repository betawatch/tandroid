package u7;

import w7.s7;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        s7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // u7.a
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // u7.a
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // u7.a
    public final Object[] p() {
        return this.e.p();
    }

    @Override // u7.d, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final d subList(int i10, int i11) {
        s7.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
