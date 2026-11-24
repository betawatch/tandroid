// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class xm5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ an5 b;

    public /* synthetic */ xm5(an5 an5Var, byte b) {
        this.a = b;
        this.b = an5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        an5 an5Var = this.b;
        switch (b) {
            case 0:
                fn5 fn5Var = an5Var.h;
                ThreadLocal threadLocal = fn5.I;
                fn5Var.Q(true);
                break;
            case 1:
                an5Var.h.u.remove(an5Var.a.e);
                gm.c3(new xm5(an5Var, (byte) 3));
                break;
            case 2:
                fn5 fn5Var2 = an5Var.h;
                ThreadLocal threadLocal2 = fn5.I;
                fn5Var2.Q(true);
                break;
            default:
                tm5 tm5Var = an5Var.a;
                nm7.f(tm5Var.o).k(nm7.Z1, tm5Var.e, 1);
                break;
        }
    }
}
