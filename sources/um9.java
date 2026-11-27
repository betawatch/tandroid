// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class um9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wm9 b;

    public /* synthetic */ um9(wm9 wm9Var, byte b) {
        this.a = b;
        this.b = wm9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wm9 wm9Var = this.b;
        switch (b) {
            case 0:
                wm9Var.g(false);
                break;
            default:
                jn7.f(wm9Var.c).k(jn7.h5, new Object[0]);
                break;
        }
    }
}
