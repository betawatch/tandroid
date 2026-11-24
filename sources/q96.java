// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class q96 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s96 b;

    public /* synthetic */ q96(s96 s96Var, byte b) {
        this.a = b;
        this.b = s96Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        s96 s96Var = this.b;
        switch (b) {
            case 0:
                s96Var.B();
                break;
            case 1:
                if (!s96Var.w) {
                    s96Var.x();
                    break;
                }
                break;
            case 2:
            case 5:
                s96Var.G();
                break;
            case 3:
                s96Var.A();
                break;
            case 4:
                s96Var.u();
                nm7.f(s96Var.e).k(nm7.G2, Long.valueOf(s96Var.s.id));
                s96Var.E(true);
                break;
            case 6:
                s96Var.A();
                break;
            case 7:
                s96Var.B();
                break;
            case 8:
                nm7.f(s96Var.e).k(nm7.G2, Long.valueOf(s96Var.j()));
                break;
            default:
                s96Var.f();
                break;
        }
    }
}
