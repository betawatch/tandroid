package u2;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
