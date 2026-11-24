// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xta implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fv4 b;

    public /* synthetic */ xta(fv4 fv4Var, byte b) {
        this.a = b;
        this.b = fv4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fv4 fv4Var = this.b;
        switch (b) {
            case 0:
                fv4Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                fv4Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                gm.c3(new xta(fv4Var, (byte) 3));
                break;
            default:
                fv4Var.a(Boolean.FALSE, null);
                break;
        }
    }
}
