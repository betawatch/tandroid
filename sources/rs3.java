// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class rs3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ss3 b;

    public /* synthetic */ rs3(ss3 ss3Var, byte b) {
        this.a = b;
        this.b = ss3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ss3 ss3Var = this.b;
        switch (b) {
            case 0:
                if (ss3Var.L > 0) {
                    ss3Var.dualToggleShape();
                    try {
                        ss3Var.performHapticFeedback(0, 1);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                ss3Var.focusToPoint((int) ss3Var.J, (int) ss3Var.K);
                break;
        }
    }
}
