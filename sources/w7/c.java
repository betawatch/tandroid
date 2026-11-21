package w7;

import c8.id;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        id.a(i7, this.d);
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
        id.c(i7, i10, this.d);
        int i11 = this.c;
        return this.e.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
