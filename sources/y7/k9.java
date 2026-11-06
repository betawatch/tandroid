package y7;

import c8.xd;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class k9 extends l9 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ l9 e;

    public k9(l9 l9Var, int i7, int i10) {
        this.e = l9Var;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        xd.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // y7.i9
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // y7.i9
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // y7.i9
    public final Object[] k() {
        return this.e.k();
    }

    @Override // y7.l9, java.util.List
    /* renamed from: l */
    public final l9 subList(int i7, int i10) {
        xd.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
