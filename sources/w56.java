// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class w56 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a66 b;

    public /* synthetic */ w56(a66 a66Var, byte b) {
        this.a = b;
        this.b = a66Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a66 a66Var = this.b;
        switch (b) {
            case 0:
                a66Var.b();
                break;
            default:
                a66Var.c();
                break;
        }
    }
}
