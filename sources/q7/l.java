package q7;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class l extends m {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ m e;

    public l(m mVar, int i7, int i10) {
        this.e = mVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a.e(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // q7.h
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // q7.h
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // q7.h
    public final Object[] l() {
        return this.e.l();
    }

    @Override // q7.m, java.util.List
    /* renamed from: n */
    public final m subList(int i7, int i10) {
        a.m(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
