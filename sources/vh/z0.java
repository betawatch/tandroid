package vh;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ z0(e1 e1Var, int i10) {
        this.a = i10;
        this.b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e1 e1Var = this.b;
                f4 f4Var = e1Var.O;
                if (f4Var != null && e1Var.d != null) {
                    e1Var.P = true;
                    f4Var.b().setPressed(false);
                    try {
                        e1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((o2) e1Var.d).a(e1Var, e1Var.O, true);
                    break;
                }
                break;
            case 1:
                this.b.n();
                break;
            default:
                this.b.s();
                break;
        }
    }
}
