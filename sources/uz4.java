// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class uz4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dz3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ uz4(dz3 dz3Var, int i, byte b) {
        this.a = b;
        this.b = dz3Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        dz3 dz3Var = this.b;
        switch (b) {
            case 0:
                ew6 ew6Var = ((wz4) ((in3) dz3Var.f).d).d;
                if (ew6Var != null) {
                    ew6Var.j(i);
                    break;
                }
                break;
            default:
                ew6 ew6Var2 = ((wz4) ((in3) dz3Var.f).d).d;
                if (ew6Var2 != null) {
                    ew6Var2.k(i);
                    break;
                }
                break;
        }
    }
}
