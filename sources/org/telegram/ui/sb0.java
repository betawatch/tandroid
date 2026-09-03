package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ sb0(yb0 yb0Var, String str, int i10) {
        this.a = i10;
        this.b = yb0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yb0 yb0Var = this.b;
                yb0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    yb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    yb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    yb0Var.o("emailRow");
                    break;
                }
                break;
            default:
                yb0 yb0Var2 = this.b;
                yb0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    yb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    yb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    yb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    yb0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
