// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r76 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t76 b;

    public /* synthetic */ r76(t76 t76Var, byte b) {
        this.a = b;
        this.b = t76Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t76 t76Var = this.b;
        switch (b) {
            case 0:
                t76Var.B();
                break;
            case 1:
                if (!t76Var.w) {
                    t76Var.x();
                    break;
                }
                break;
            case 2:
            case 5:
                t76Var.G();
                break;
            case 3:
                t76Var.A();
                break;
            case 4:
                t76Var.u();
                kk7.f(t76Var.e).k(kk7.F2, Long.valueOf(t76Var.s.id));
                t76Var.E(true);
                break;
            case 6:
                t76Var.A();
                break;
            case 7:
                t76Var.B();
                break;
            case 8:
                kk7.f(t76Var.e).k(kk7.F2, Long.valueOf(t76Var.j()));
                break;
            default:
                t76Var.f();
                break;
        }
    }
}
