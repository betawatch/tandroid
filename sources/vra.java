// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.c3(new vra(et4Var, (byte) 3));
                break;
            default:
                et4Var.a(Boolean.FALSE, null);
                break;
        }
    }
}
