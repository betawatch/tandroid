package u2;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ q0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
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
                v0 v0Var = this.b;
                if (!v0Var.f0) {
                    c0 c0Var = v0Var.I;
                    c0Var.getClass();
                    c0Var.f(v0Var);
                    break;
                }
                break;
        }
    }
}
