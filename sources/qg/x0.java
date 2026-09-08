package qg;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ x0(y0 y0Var, int i10) {
        this.a = i10;
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
