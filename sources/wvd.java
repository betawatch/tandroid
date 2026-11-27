// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wvd extends dwd {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ dwd e;

    public wvd(dwd dwdVar, int i, int i2) {
        this.e = dwdVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a6f.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // qvd
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // qvd
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // qvd
    public final Object[] l() {
        return this.e.l();
    }

    @Override // dwd, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final dwd subList(int i, int i2) {
        a6f.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
