// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yv4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fw4 b;

    public /* synthetic */ yv4(fw4 fw4Var, byte b) {
        this.a = b;
        this.b = fw4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fw4 fw4Var = this.b;
        switch (b) {
            case 0:
                g0d g0dVar = fw4Var.q1;
                va2 va2Var = fw4Var.p1;
                if (va2Var != null) {
                    va2Var.d();
                }
                dw4 dw4Var = fw4Var.B1;
                if (dw4Var != null) {
                    dw4Var.setTranslationY(-g0dVar.d());
                }
                io ioVar = fw4Var.v1;
                if (ioVar != null) {
                    ioVar.setTranslationY(-g0dVar.d());
                }
                fw4Var.D0();
                break;
            case 1:
                fw4Var.B1.performClick();
                break;
            case 2:
                fw4Var.r1.k1();
                break;
            default:
                fw4Var.dismiss();
                break;
        }
    }
}
