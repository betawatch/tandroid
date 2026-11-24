// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x4f extends f7f {
    public final transient int h;
    public final transient int n;
    public final /* synthetic */ f7f r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4f(f7f f7fVar, int i, int i2) {
        super((byte) 2);
        this.r = f7fVar;
        this.h = i;
        this.n = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        q1f.a(i, this.n);
        return this.r.get(i + this.h);
    }

    @Override // x8d
    public final int i() {
        return this.r.j() + this.h + this.n;
    }

    @Override // x8d
    public final int j() {
        return this.r.j() + this.h;
    }

    @Override // x8d
    public final Object[] k() {
        return this.r.k();
    }

    @Override // f7f, java.util.List
    /* renamed from: l */
    public final f7f subList(int i, int i2) {
        q1f.b(i, i2, this.n);
        int i3 = this.h;
        return this.r.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
