// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class uu7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv7 b;
    public final /* synthetic */ ao9 c;

    public /* synthetic */ uu7(xv7 xv7Var, ao9 ao9Var, byte b) {
        this.a = b;
        this.b = xv7Var;
        this.c = ao9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ao9 ao9Var = this.c;
        xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                xv7Var.D0(ao9Var, true);
                break;
            default:
                xv7Var.B0(ao9Var);
                break;
        }
    }
}
