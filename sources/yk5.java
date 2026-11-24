// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class yk5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ al5 b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ yk5(al5 al5Var, Boolean bool, byte b) {
        this.a = b;
        this.b = al5Var;
        this.c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Boolean bool = this.c;
        al5 al5Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                al5Var.h.u.remove(al5Var.a.e);
                gl.d3(new yk5(al5Var, bool, b2));
                break;
            default:
                boolean booleanValue = bool.booleanValue();
                tk5 tk5Var = al5Var.a;
                if (!booleanValue) {
                    kk7.f(tk5Var.o).k(kk7.Y1, tk5Var.e, 2);
                    break;
                } else {
                    kk7.f(tk5Var.o).k(kk7.X1, tk5Var.e, tk5Var.p);
                    break;
                }
        }
    }
}
