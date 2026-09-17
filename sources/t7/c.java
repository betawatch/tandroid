package t7;

import w7.i7;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class c extends d {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i7.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // t7.a
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // t7.a
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // t7.a
    public final Object[] p() {
        return this.e.p();
    }

    @Override // t7.d, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final d subList(int i10, int i11) {
        i7.c(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
