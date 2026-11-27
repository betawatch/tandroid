// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qjd extends vjd {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ vjd e;

    public qjd(vjd vjdVar, int i, int i2) {
        this.e = vjdVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k4f.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // ejd
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // ejd
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // ejd
    public final boolean l() {
        return true;
    }

    @Override // ejd
    public final Object[] m() {
        return this.e.m();
    }

    @Override // vjd, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final vjd subList(int i, int i2) {
        k4f.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
