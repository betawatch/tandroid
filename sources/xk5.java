// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class xk5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ al5 b;

    public /* synthetic */ xk5(al5 al5Var, byte b) {
        this.a = b;
        this.b = al5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        al5 al5Var = this.b;
        switch (b) {
            case 0:
                fl5 fl5Var = al5Var.h;
                ThreadLocal threadLocal = fl5.I;
                fl5Var.Q(true);
                break;
            case 1:
                al5Var.h.u.remove(al5Var.a.e);
                gl.c3(new xk5(al5Var, (byte) 3));
                break;
            case 2:
                fl5 fl5Var2 = al5Var.h;
                ThreadLocal threadLocal2 = fl5.I;
                fl5Var2.Q(true);
                break;
            default:
                tk5 tk5Var = al5Var.a;
                kk7.f(tk5Var.o).k(kk7.Y1, tk5Var.e, 1);
                break;
        }
    }
}
