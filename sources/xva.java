// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xva implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iv4 b;

    public /* synthetic */ xva(iv4 iv4Var, byte b) {
        this.a = b;
        this.b = iv4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        iv4 iv4Var = this.b;
        switch (b) {
            case 0:
                iv4Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                iv4Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                hl.c3(new xva(iv4Var, (byte) 3));
                break;
            default:
                iv4Var.a(Boolean.FALSE, null);
                break;
        }
    }
}
