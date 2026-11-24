// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vrb extends wrb {
    @Override // wrb
    /* renamed from: B */
    public final wrb s() {
        super.s();
        this.m = new fz();
        return this;
    }

    @Override // wrb, eu5
    public final /* bridge */ /* synthetic */ eu5 s() {
        s();
        return this;
    }

    @Override // eu5
    public final String toString() {
        fz fzVar = this.m;
        if (fzVar == null || fzVar.a <= 0) {
            return "<" + z() + ">";
        }
        return "<" + z() + " " + this.m.toString() + ">";
    }
}
