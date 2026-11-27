// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vtb extends wtb {
    @Override // wtb
    /* renamed from: B */
    public final wtb s() {
        super.s();
        this.m = new gy();
        return this;
    }

    @Override // wtb, iu5
    public final /* bridge */ /* synthetic */ iu5 s() {
        s();
        return this;
    }

    @Override // iu5
    public final String toString() {
        gy gyVar = this.m;
        if (gyVar == null || gyVar.a <= 0) {
            return "<" + z() + ">";
        }
        return "<" + z() + " " + this.m.toString() + ">";
    }
}
