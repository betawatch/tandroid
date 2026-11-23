package x7;

import c8.pd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c extends d {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ d e;

    public c(d dVar, int i7, int i10) {
        this.e = dVar;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        pd.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // x7.a
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // x7.a
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // x7.a
    public final Object[] k() {
        return this.e.k();
    }

    @Override // x7.d, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final d subList(int i7, int i10) {
        pd.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
