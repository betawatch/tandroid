// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ua5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ va5 b;

    public /* synthetic */ ua5(va5 va5Var, byte b) {
        this.a = b;
        this.b = va5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        va5 va5Var = this.b;
        switch (b) {
            case 0:
                int width = va5Var.getWidth();
                int height = va5Var.getHeight();
                if (va5Var.w && !va5Var.y && width > 0 && height > 0 && !va5Var.a.isEmpty() && va5Var.F > 0.0f && va5Var.b() && Math.abs(Math.log((width / height) / va5Var.F)) > 0.06d) {
                    va5Var.f(true);
                    break;
                }
                break;
            default:
                if (va5Var.y) {
                    va5Var.g();
                    va5Var.post(new ua5(va5Var, (byte) 0));
                    break;
                }
                break;
        }
    }
}
