// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.d3(new xk5(al5Var, (byte) 3));
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
