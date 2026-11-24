// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zed extends efd {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ efd e;

    public zed(efd efdVar, int i, int i2) {
        this.e = efdVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sze.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // ned
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // ned
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // ned
    public final boolean l() {
        return true;
    }

    @Override // ned
    public final Object[] m() {
        return this.e.m();
    }

    @Override // efd, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final efd subList(int i, int i2) {
        sze.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
