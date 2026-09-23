package pg;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ y0(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b1 b1Var = this.b.b.d;
                if (b1Var != null) {
                    b1Var.postRunnable(b1Var.w);
                    break;
                }
                break;
            case 1:
                b1 b1Var2 = this.b.b.d;
                if (b1Var2 != null) {
                    b1Var2.postRunnable(b1Var2.w);
                    break;
                }
                break;
            default:
                d1 d1Var = this.b.b;
                b1 b1Var3 = d1Var.d;
                b1Var3.getClass();
                b1Var3.postRunnable(new a1(b1Var3, 2));
                d1Var.d = null;
                break;
        }
    }
}
