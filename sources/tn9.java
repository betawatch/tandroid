// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class tn9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ao9 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ tn9(ao9 ao9Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = ao9Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        ao9 ao9Var = this.b;
        switch (b) {
            case 0:
                if (!ao9Var.h) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (!ao9Var.h) {
                    ao9Var.h = true;
                    ao9Var.e.C();
                    ao9Var.b.removeCallbacks(ao9Var.n);
                    y54 y54Var = ao9Var.f;
                    if (y54Var != null) {
                        y54Var.g1();
                        ao9Var.f = null;
                    }
                    ao9Var.g = null;
                    ao9Var.a.quitSafely();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
