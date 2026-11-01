package vh;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ j7(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o8 o8Var = this.b;
                o8Var.getClass();
                o8Var.f(1.0f, true, new y6(o8Var, 6));
                o8Var.b1.b(true, true);
                break;
            default:
                o8 o8Var2 = this.b;
                o8Var2.e(false);
                o8Var2.m2 = null;
                break;
        }
    }
}
