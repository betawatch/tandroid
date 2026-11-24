// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qra implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ae2 b;

    public /* synthetic */ qra(ae2 ae2Var, byte b) {
        this.a = b;
        this.b = ae2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ae2 ae2Var = this.b;
        switch (b) {
            case 0:
                ae2Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                ae2Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                gl.d3(new qra(ae2Var, (byte) 3));
                break;
            default:
                ae2Var.a(Boolean.FALSE, null);
                break;
        }
    }
}
