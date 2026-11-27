// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class u96 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w96 b;

    public /* synthetic */ u96(w96 w96Var, byte b) {
        this.a = b;
        this.b = w96Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        w96 w96Var = this.b;
        switch (b) {
            case 0:
                w96Var.u();
                jn7.f(w96Var.e).k(jn7.G2, Long.valueOf(w96Var.s.id));
                w96Var.E(true);
                break;
            case 1:
                w96Var.A();
                break;
            case 2:
                w96Var.B();
                break;
            case 3:
                jn7.f(w96Var.e).k(jn7.G2, Long.valueOf(w96Var.j()));
                break;
            case 4:
            case 7:
                w96Var.G();
                break;
            case 5:
                w96Var.B();
                break;
            case 6:
                if (!w96Var.w) {
                    w96Var.x();
                    break;
                }
                break;
            case 8:
                w96Var.A();
                break;
            default:
                w96Var.f();
                break;
        }
    }
}
