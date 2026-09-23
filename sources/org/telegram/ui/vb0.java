package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ vb0(ac0 ac0Var, String str, int i10) {
        this.a = i10;
        this.b = ac0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ac0 ac0Var = this.b;
                ac0Var.getClass();
                String str = this.c;
                if ("disable".equalsIgnoreCase(str)) {
                    ac0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ac0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ac0Var.o("emailRow");
                    break;
                }
                break;
            default:
                ac0 ac0Var2 = this.b;
                ac0Var2.getClass();
                String str2 = this.c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ac0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ac0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ac0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ac0Var2.o("fingerprintRow");
                    break;
                }
                break;
        }
    }
}
