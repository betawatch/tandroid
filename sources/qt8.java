// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qt8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ au8 b;

    public /* synthetic */ qt8(au8 au8Var, byte b) {
        this.a = b;
        this.b = au8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        au8 au8Var = this.b;
        switch (b) {
            case 0:
                au8Var.b();
                break;
            case 1:
                au8Var.c();
                break;
            case 2:
                au8Var.f(false);
                break;
            default:
                au8Var.d();
                break;
        }
    }
}
