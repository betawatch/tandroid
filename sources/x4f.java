// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
