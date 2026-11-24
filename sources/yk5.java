// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.c3(new yk5(al5Var, bool, b2));
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
