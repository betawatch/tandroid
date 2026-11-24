// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uv4 implements it3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv4 b;

    public /* synthetic */ uv4(xv4 xv4Var, byte b) {
        this.a = b;
        this.b = xv4Var;
    }

    @Override // it3
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        xv4 xv4Var = this.b;
        switch (b) {
            case 0:
                xv4Var.b(f / 1000.0f);
                break;
            default:
                xv4Var.b(Math.max(0.0f, f / 1000.0f));
                break;
        }
    }
}
