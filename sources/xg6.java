// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xg6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zj3 b;

    public /* synthetic */ xg6(zj3 zj3Var, byte b) {
        this.a = b;
        this.b = zj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zj3 zj3Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new xg6(zj3Var, (byte) 1));
                break;
            default:
                zj3Var.a("CANCELLED");
                break;
        }
    }
}
