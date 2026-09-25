package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ub0(zb0 zb0Var, String str, int i10) {
        this.a = i10;
        this.b = zb0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zb0 zb0Var = this.b;
                zb0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    zb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    zb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    zb0Var.o("emailRow");
                    break;
                }
                break;
            default:
                zb0 zb0Var2 = this.b;
                zb0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    zb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    zb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    zb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    zb0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
