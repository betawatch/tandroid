// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
