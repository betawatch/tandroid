package xf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ x0(y0 y0Var, int i9) {
        this.a = i9;
        this.b = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a1 a1Var = this.b.b.d;
                if (a1Var != null) {
                    a1Var.postRunnable(a1Var.w);
                    break;
                }
                break;
            case 1:
                a1 a1Var2 = this.b.b.d;
                if (a1Var2 != null) {
                    a1Var2.postRunnable(a1Var2.w);
                    break;
                }
                break;
            default:
                c1 c1Var = this.b.b;
                a1 a1Var3 = c1Var.d;
                a1Var3.getClass();
                a1Var3.postRunnable(new z0(a1Var3, 2));
                c1Var.d = null;
                break;
        }
    }
}
