// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dg9 b;

    public /* synthetic */ yf9(dg9 dg9Var, byte b) {
        this.a = b;
        this.b = dg9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dg9 dg9Var = this.b;
        switch (b) {
            case 0:
                dj9 dj9Var = dg9Var.M2;
                if (dj9Var != null && dg9Var.g2 != null) {
                    dg9Var.N2 = true;
                    dj9Var.b().a.m(false);
                    try {
                        dg9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((oh9) dg9Var.g2).a(dg9Var, dg9Var.M2, true);
                    break;
                }
                break;
            case 1:
                dg9Var.K();
                break;
            default:
                dg9Var.P();
                break;
        }
    }
}
