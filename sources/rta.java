// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rta implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lf2 b;

    public /* synthetic */ rta(lf2 lf2Var, byte b) {
        this.a = b;
        this.b = lf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lf2 lf2Var = this.b;
        switch (b) {
            case 0:
                lf2Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                lf2Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                gm.c3(new rta(lf2Var, (byte) 3));
                break;
            default:
                lf2Var.a(Boolean.FALSE, null);
                break;
        }
    }
}
