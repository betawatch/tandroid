package x6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends m {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ m e;

    public l(m mVar, int i9, int i10) {
        this.e = mVar;
        this.c = i9;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        a.e(i9, this.d);
        return this.e.get(i9 + this.c);
    }

    @Override // x6.h
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // x6.h
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // x6.h
    public final Object[] q() {
        return this.e.q();
    }

    @Override // x6.m, java.util.List
    /* renamed from: s */
    public final m subList(int i9, int i10) {
        a.m(i9, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i9 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
