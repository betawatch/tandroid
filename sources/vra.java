// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vra implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ et4 b;

    public /* synthetic */ vra(et4 et4Var, byte b) {
        this.a = b;
        this.b = et4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        et4 et4Var = this.b;
        switch (b) {
            case 0:
                et4Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                et4Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                gl.d3(new vra(et4Var, (byte) 3));
                break;
            default:
                et4Var.a(Boolean.FALSE, null);
                break;
        }
    }
}
