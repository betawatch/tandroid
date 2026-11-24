// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bl9 b;

    public /* synthetic */ xk9(bl9 bl9Var, byte b) {
        this.a = b;
        this.b = bl9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bl9 bl9Var = this.b;
        switch (b) {
            case 0:
                bl9Var.c();
                break;
            default:
                bl9Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(s33.h).setDuration(280L).start();
                bl9Var.c = System.currentTimeMillis();
                bl9Var.invalidate();
                try {
                    bl9Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                gl.d3(bl9Var.h, 59500L);
                break;
        }
    }
}
