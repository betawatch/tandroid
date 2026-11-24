// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wp5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yp5 b;
    public final /* synthetic */ f08 c;

    public /* synthetic */ wp5(yp5 yp5Var, f08 f08Var, byte b) {
        this.a = b;
        this.b = yp5Var;
        this.c = f08Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        f08 f08Var = this.c;
        yp5 yp5Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new wp5(yp5Var, f08Var, (byte) 1));
                break;
            default:
                yp5Var.i = f08Var.a;
                break;
        }
    }
}
