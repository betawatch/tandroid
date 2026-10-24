package u2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ r0(y0 y0Var, int i10) {
        this.a = i10;
        this.b = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0 = true;
                break;
            case 1:
                this.b.w();
                break;
            default:
                y0 y0Var = this.b;
                if (!y0Var.h0) {
                    e0 e0Var = y0Var.I;
                    e0Var.getClass();
                    e0Var.b(y0Var);
                    break;
                }
                break;
        }
    }
}
