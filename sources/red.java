// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class red extends ted {
    public final transient int h;
    public final transient int n;
    public final /* synthetic */ ted r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public red(ted tedVar, int i, int i2) {
        super((byte) 0);
        this.r = tedVar;
        this.h = i;
        this.n = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        d7f.a(i, this.n);
        return this.r.get(i + this.h);
    }

    @Override // qdd
    public final int i() {
        return this.r.j() + this.h + this.n;
    }

    @Override // qdd
    public final int j() {
        return this.r.j() + this.h;
    }

    @Override // qdd
    public final Object[] k() {
        return this.r.k();
    }

    @Override // ted, java.util.List
    /* renamed from: l */
    public final ted subList(int i, int i2) {
        d7f.b(i, i2, this.n);
        int i3 = this.h;
        return this.r.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
