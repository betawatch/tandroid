// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
