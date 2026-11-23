package z7;

import c8.me;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        me.a(i7, this.d);
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
        me.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
