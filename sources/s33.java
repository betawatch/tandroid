// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class s33 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a33 b;
    public final /* synthetic */ vu4 c;

    public /* synthetic */ s33(a33 a33Var, vu4 vu4Var, byte b) {
        this.a = b;
        this.b = a33Var;
        this.c = vu4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        a33 a33Var = this.b;
        switch (b) {
            case 0:
                a33Var.A(obj);
                break;
            case 1:
                if (obj == null) {
                    obj = new uu4("No provider data returned", (byte) 2);
                }
                a33Var.A(obj);
                break;
            default:
                a33Var.A(obj);
                break;
        }
    }
}
