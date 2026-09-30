package pg;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ z0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b.b.d;
                if (d1Var != null) {
                    d1Var.postRunnable(d1Var.w);
                    break;
                }
                break;
            case 1:
                d1 d1Var2 = this.b.b.d;
                if (d1Var2 != null) {
                    d1Var2.postRunnable(d1Var2.w);
                    break;
                }
                break;
            default:
                f1 f1Var = this.b.b;
                d1 d1Var3 = f1Var.d;
                d1Var3.getClass();
                d1Var3.postRunnable(new b1(d1Var3, 2));
                f1Var.d = null;
                break;
        }
    }
}
