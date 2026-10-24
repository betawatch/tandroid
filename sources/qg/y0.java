package qg;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ y0(e1 e1Var, int i10) {
        this.a = i10;
        this.b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b.a;
                if (d1Var != null) {
                    d1Var.b();
                    break;
                }
                break;
            case 1:
                e1 e1Var = this.b;
                e1Var.c.a(e1Var.r);
                c1 c1Var = e1Var.d;
                c1Var.getClass();
                c1Var.postRunnable(new b1(c1Var, 2));
                e1Var.d = null;
                break;
            default:
                e1 e1Var2 = this.b;
                e1Var2.c.q(e1Var2.x);
                break;
        }
    }
}
