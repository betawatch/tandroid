package w7;

import c8.fd;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        fd.a(i7, this.d);
        return this.e.get(i7 + this.c);
    }

    @Override // w7.a
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // w7.a
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // w7.a
    public final Object[] k() {
        return this.e.k();
    }

    @Override // w7.d, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final d subList(int i7, int i10) {
        fd.c(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
