// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
