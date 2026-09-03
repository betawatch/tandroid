package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ rb0(xb0 xb0Var, String str, int i10) {
        this.a = i10;
        this.b = xb0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xb0 xb0Var = this.b;
                xb0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    xb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    xb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    xb0Var.o("emailRow");
                    break;
                }
                break;
            default:
                xb0 xb0Var2 = this.b;
                xb0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    xb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    xb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    xb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    xb0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
