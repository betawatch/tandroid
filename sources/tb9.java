// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tb9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xb9 b;

    public /* synthetic */ tb9(xb9 xb9Var, byte b) {
        this.a = b;
        this.b = xb9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xb9 xb9Var = this.b;
        switch (b) {
            case 0:
                qb9 qb9Var = xb9Var.c;
                if (!qb9Var.j.isEmpty()) {
                    qb9Var.j.clear();
                    qb9Var.m();
                    break;
                }
                break;
            case 1:
                qb9 qb9Var2 = xb9Var.c;
                if (!qb9Var2.k.isEmpty()) {
                    qb9Var2.k.clear();
                    qb9Var2.m();
                    break;
                }
                break;
            case 2:
                qb9 qb9Var3 = xb9Var.c;
                if (!qb9Var3.l.isEmpty()) {
                    qb9Var3.l.clear();
                    qb9Var3.m();
                    break;
                }
                break;
            case 3:
                xb9Var.c.p(pb9.a);
                break;
            case 4:
                xb9Var.c.p(pb9.b);
                break;
            default:
                xb9Var.c.p(pb9.c);
                break;
        }
    }
}
