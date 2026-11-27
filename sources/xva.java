// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
