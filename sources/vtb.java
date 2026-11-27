// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
