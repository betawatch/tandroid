// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class t56 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a66 b;
    public final /* synthetic */ String c;

    public /* synthetic */ t56(a66 a66Var, String str, byte b) {
        this.a = b;
        this.b = a66Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        a66 a66Var = this.b;
        switch (b) {
            case 0:
                if ("disable".equalsIgnoreCase(str)) {
                    a66Var.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    a66Var.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str)) {
                    a66Var.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str)) {
                    a66Var.x("fingerprintRow");
                    break;
                }
                break;
            case 1:
                a66Var.w(str);
                break;
            case 2:
                if ("disable".equalsIgnoreCase(str)) {
                    a66Var.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    a66Var.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    a66Var.x("emailRow");
                    break;
                }
                break;
            default:
                if (a66Var.a()) {
                    a66Var.w(str);
                    break;
                }
                break;
        }
    }
}
