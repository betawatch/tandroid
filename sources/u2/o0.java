package u2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ o0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z = true;
                break;
            case 1:
                this.b.w();
                break;
            default:
                t0 t0Var = this.b;
                if (!t0Var.f0) {
                    c0 c0Var = t0Var.I;
                    c0Var.getClass();
                    c0Var.v(t0Var);
                    break;
                }
                break;
        }
    }
}
