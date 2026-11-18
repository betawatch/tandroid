package x7;

import c8.od;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        od.a(i7, this.d);
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
        od.b(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
