// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ym5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ an5 b;
    public final /* synthetic */ Boolean c;

    public /* synthetic */ ym5(an5 an5Var, Boolean bool, byte b) {
        this.a = b;
        this.b = an5Var;
        this.c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Boolean bool = this.c;
        an5 an5Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                an5Var.h.u.remove(an5Var.a.e);
                gm.c3(new ym5(an5Var, bool, b2));
                break;
            default:
                boolean booleanValue = bool.booleanValue();
                tm5 tm5Var = an5Var.a;
                if (!booleanValue) {
                    nm7.f(tm5Var.o).k(nm7.Z1, tm5Var.e, 2);
                    break;
                } else {
                    nm7.f(tm5Var.o).k(nm7.Y1, tm5Var.e, tm5Var.p);
                    break;
                }
        }
    }
}
