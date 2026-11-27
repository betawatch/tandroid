// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class un9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xn9 b;

    public /* synthetic */ un9(xn9 xn9Var, byte b) {
        this.a = b;
        this.b = xn9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xn9 xn9Var = this.b;
        switch (b) {
            case 0:
                if (xn9Var.W != 0) {
                    xn9Var.V = true;
                    break;
                }
                break;
            default:
                xn9Var.c();
                break;
        }
    }
}
