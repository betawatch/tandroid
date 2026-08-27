package yf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ w0(x0 x0Var, int i10) {
        this.a = i10;
        this.b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z0 z0Var = this.b.b.d;
                if (z0Var != null) {
                    z0Var.postRunnable(z0Var.w);
                    break;
                }
                break;
            case 1:
                z0 z0Var2 = this.b.b.d;
                if (z0Var2 != null) {
                    z0Var2.postRunnable(z0Var2.w);
                    break;
                }
                break;
            default:
                b1 b1Var = this.b.b;
                z0 z0Var3 = b1Var.d;
                z0Var3.getClass();
                z0Var3.postRunnable(new y0(z0Var3, 2));
                b1Var.d = null;
                break;
        }
    }
}
