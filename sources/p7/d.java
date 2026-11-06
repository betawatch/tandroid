package p7;

import c8.cb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d extends e {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ e e;

    public d(e eVar, int i7, int i10) {
        this.e = eVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // p7.a
    public final Object[] f() {
        return this.e.f();
    }

    @Override // java.util.List
    public final Object get(int i7) {
        cb.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // p7.a
    public final int i() {
        return this.e.i() + this.c;
    }

    @Override // p7.a
    public final int j() {
        return this.e.i() + this.c + this.d;
    }

    @Override // p7.e, java.util.List
    /* renamed from: m */
    public final e subList(int i7, int i10) {
        cb.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
