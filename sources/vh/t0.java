package vh;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ t0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (u0Var.K > 0) {
                    u0Var.dualToggleShape();
                    try {
                        u0Var.performHapticFeedback(0, 1);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                u0 u0Var2 = this.b;
                u0Var2.focusToPoint((int) u0Var2.I, (int) u0Var2.J);
                break;
        }
    }
}
