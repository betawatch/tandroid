// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y89 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e99 b;

    public /* synthetic */ y89(e99 e99Var, byte b) {
        this.a = b;
        this.b = e99Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e99 e99Var = this.b;
        switch (b) {
            case 0:
                d99 d99Var = e99Var.a;
                if (d99Var != null) {
                    d99Var.z();
                    break;
                }
                break;
            case 1:
                e99Var.c.a(e99Var.r);
                c99 c99Var = e99Var.d;
                c99Var.getClass();
                c99Var.postRunnable(new b99(c99Var, (byte) 2));
                e99Var.d = null;
                break;
            default:
                e99Var.c.q(e99Var.y);
                break;
        }
    }
}
