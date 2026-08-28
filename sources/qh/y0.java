package qh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ y0(d1 d1Var, int i9) {
        this.a = i9;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                b4 b4Var = d1Var.N;
                if (b4Var != null && d1Var.d != null) {
                    d1Var.O = true;
                    b4Var.b().setPressed(false);
                    try {
                        d1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((m2) d1Var.d).a(d1Var, d1Var.N, true);
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
