// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pz7 implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tz7 b;

    public /* synthetic */ pz7(tz7 tz7Var, byte b) {
        this.a = b;
        this.b = tz7Var;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        tz7 tz7Var = this.b;
        switch (b) {
            case 0:
                tz7Var.d(true);
                tz7Var.R.N1(null, 0, true);
                break;
            default:
                tz7Var.d(true);
                tz7Var.R.finishFragment();
                break;
        }
    }
}
