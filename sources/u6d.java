// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class u6d extends a7d {
    public final transient int r;
    public final transient int s;
    public final /* synthetic */ a7d w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6d(a7d a7dVar, int i, int i2) {
        super((byte) 3);
        this.w = a7dVar;
        this.r = i;
        this.s = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u3f.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override // kzc
    public final Object[] r() {
        return this.w.r();
    }

    @Override // kzc
    public final int s() {
        return this.w.s() + this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // kzc
    public final int t() {
        return this.w.s() + this.r + this.s;
    }

    @Override // a7d, java.util.List
    /* renamed from: z */
    public final a7d subList(int i, int i2) {
        u3f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
