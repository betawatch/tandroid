// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class pc implements x76, fu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    public /* synthetic */ pc(float f, byte b) {
        this.a = b;
        this.b = f;
    }

    @Override // fu2
    public final void accept(Object obj) {
        byte b = this.a;
        float f = this.b;
        cf8 cf8Var = (cf8) obj;
        switch (b) {
            case 3:
                cf8Var.d(f);
                break;
            default:
                cf8Var.R(f);
                break;
        }
    }

    @Override // x76
    public final void invoke(Object obj) {
        ((pe8) obj).q(this.b);
    }
}
