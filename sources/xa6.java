// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class xa6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dt5 b;
    public final /* synthetic */ gb6 c;

    public /* synthetic */ xa6(dt5 dt5Var, gb6 gb6Var, byte b) {
        this.a = b;
        this.b = dt5Var;
        this.c = gb6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gb6 gb6Var = this.c;
        dt5 dt5Var = this.b;
        switch (b) {
            case 0:
                dt5Var.run();
                gb6Var.a();
                break;
            default:
                dt5Var.run();
                gb6Var.a();
                break;
        }
    }
}
