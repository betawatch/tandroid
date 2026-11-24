// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class y64 implements x76 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h74 b;

    public /* synthetic */ y64(h74 h74Var, byte b) {
        this.a = b;
        this.b = h74Var;
    }

    @Override // x76
    public final void invoke(Object obj) {
        byte b = this.a;
        h74 h74Var = this.b;
        pe8 pe8Var = (pe8) obj;
        switch (b) {
            case 2:
                pe8Var.K(h74Var.P);
                break;
            default:
                pe8Var.C(h74Var.R);
                break;
        }
    }
}
