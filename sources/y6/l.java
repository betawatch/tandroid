package y6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l extends m {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ m e;

    public l(m mVar, int i10, int i11) {
        this.e = mVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a.e(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // y6.h
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // y6.h
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // y6.h
    public final Object[] q() {
        return this.e.q();
    }

    @Override // y6.m, java.util.List
    /* renamed from: s */
    public final m subList(int i10, int i11) {
        a.m(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
