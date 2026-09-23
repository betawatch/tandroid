package pg;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ x0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b.a;
                if (c1Var != null) {
                    c1Var.b();
                    break;
                }
                break;
            case 1:
                d1 d1Var = this.b;
                d1Var.c.a(d1Var.r);
                b1 b1Var = d1Var.d;
                b1Var.getClass();
                b1Var.postRunnable(new a1(b1Var, 2));
                d1Var.d = null;
                break;
            default:
                d1 d1Var2 = this.b;
                d1Var2.c.q(d1Var2.x);
                break;
        }
    }
}
