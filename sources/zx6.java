// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class zx6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qy6 b;

    public /* synthetic */ zx6(qy6 qy6Var, byte b) {
        this.a = b;
        this.b = qy6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qy6 qy6Var = this.b;
        switch (b) {
            case 0:
                qy6Var.m0(new zx6(qy6Var, (byte) 1));
                break;
            default:
                qy6Var.p0();
                break;
        }
    }
}
