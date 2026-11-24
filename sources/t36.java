// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t36 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a46 b;
    public final /* synthetic */ String c;

    public /* synthetic */ t36(a46 a46Var, String str, byte b) {
        this.a = b;
        this.b = a46Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        a46 a46Var = this.b;
        switch (b) {
            case 0:
                if ("disable".equalsIgnoreCase(str)) {
                    a46Var.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    a46Var.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str)) {
                    a46Var.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str)) {
                    a46Var.x("fingerprintRow");
                    break;
                }
                break;
            case 1:
                a46Var.w(str);
                break;
            case 2:
                if ("disable".equalsIgnoreCase(str)) {
                    a46Var.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    a46Var.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    a46Var.x("emailRow");
                    break;
                }
                break;
            default:
                if (a46Var.a()) {
                    a46Var.w(str);
                    break;
                }
                break;
        }
    }
}
