// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w56 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e66 b;
    public final /* synthetic */ String c;

    public /* synthetic */ w56(e66 e66Var, String str, byte b) {
        this.a = b;
        this.b = e66Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        e66 e66Var = this.b;
        switch (b) {
            case 0:
                if ("disable".equalsIgnoreCase(str)) {
                    e66Var.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    e66Var.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str)) {
                    e66Var.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str)) {
                    e66Var.x("fingerprintRow");
                    break;
                }
                break;
            case 1:
                e66Var.w(str);
                break;
            case 2:
                if ("disable".equalsIgnoreCase(str)) {
                    e66Var.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    e66Var.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    e66Var.x("emailRow");
                    break;
                }
                break;
            default:
                if (e66Var.a()) {
                    e66Var.w(str);
                    break;
                }
                break;
        }
    }
}
