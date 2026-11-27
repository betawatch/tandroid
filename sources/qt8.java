// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
