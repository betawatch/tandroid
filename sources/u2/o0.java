package u2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ o0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z = true;
                break;
            case 1:
                this.b.t();
                break;
            default:
                u0 u0Var = this.b;
                if (!u0Var.f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.D(u0Var);
                    break;
                }
                break;
        }
    }
}
