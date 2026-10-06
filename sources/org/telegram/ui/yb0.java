package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ yb0(dc0 dc0Var, String str, int i10) {
        this.a = i10;
        this.b = dc0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dc0 dc0Var = this.b;
                dc0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    dc0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    dc0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    dc0Var.o("emailRow");
                    break;
                }
                break;
            default:
                dc0 dc0Var2 = this.b;
                dc0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    dc0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    dc0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    dc0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    dc0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
