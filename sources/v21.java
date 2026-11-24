// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class v21 implements it3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y21 b;
    public final /* synthetic */ gu2 c;

    public /* synthetic */ v21(gu2 gu2Var, y21 y21Var, byte b) {
        this.a = b;
        this.c = gu2Var;
        this.b = y21Var;
    }

    @Override // it3
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        y21 y21Var = this.b;
        gu2 gu2Var = this.c;
        switch (b) {
            case 0:
                ((gx) gu2Var).accept(Float.valueOf(y21Var.getTranslationY()));
                break;
            default:
                ((t52) gu2Var).accept(Float.valueOf(y21Var.getTranslationY()));
                break;
        }
    }
}
