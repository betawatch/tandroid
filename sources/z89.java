// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z89 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a99 b;

    public /* synthetic */ z89(a99 a99Var, byte b) {
        this.a = b;
        this.b = a99Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a99 a99Var = this.b;
        switch (b) {
            case 0:
                c99 c99Var = a99Var.b.d;
                if (c99Var != null) {
                    c99Var.postRunnable(c99Var.x);
                    break;
                }
                break;
            case 1:
                c99 c99Var2 = a99Var.b.d;
                if (c99Var2 != null) {
                    c99Var2.postRunnable(c99Var2.x);
                    break;
                }
                break;
            default:
                e99 e99Var = a99Var.b;
                c99 c99Var3 = e99Var.d;
                c99Var3.getClass();
                c99Var3.postRunnable(new b99(c99Var3, (byte) 2));
                e99Var.d = null;
                break;
        }
    }
}
