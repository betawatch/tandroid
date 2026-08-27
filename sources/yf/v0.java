package yf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ v0(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a1 a1Var = this.b.a;
                if (a1Var != null) {
                    a1Var.b();
                    break;
                }
                break;
            case 1:
                b1 b1Var = this.b;
                b1Var.c.a(b1Var.r);
                z0 z0Var = b1Var.d;
                z0Var.getClass();
                z0Var.postRunnable(new y0(z0Var, 2));
                b1Var.d = null;
                break;
            default:
                b1 b1Var2 = this.b;
                b1Var2.c.q(b1Var2.x);
                break;
        }
    }
}
