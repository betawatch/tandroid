package ph;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ u0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                if (v0Var.H > 0) {
                    v0Var.dualToggleShape();
                    try {
                        v0Var.performHapticFeedback(0, 1);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                v0 v0Var2 = this.b;
                v0Var2.focusToPoint((int) v0Var2.F, (int) v0Var2.G);
                break;
        }
    }
}
