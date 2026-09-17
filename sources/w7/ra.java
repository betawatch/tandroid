package w7;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class ra extends sa {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ sa e;

    public ra(sa saVar, int i10, int i11) {
        this.e = saVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a8.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // w7.k9
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // w7.k9
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // w7.k9
    public final Object[] p() {
        return this.e.p();
    }

    @Override // w7.sa, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final sa subList(int i10, int i11) {
        a8.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
