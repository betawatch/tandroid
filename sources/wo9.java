// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jp9 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ wo9(jp9 jp9Var, Exception exc, byte b) {
        this.a = b;
        this.b = jp9Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        jp9 jp9Var = this.b;
        switch (b) {
            case 0:
                jp9Var.h(exc);
                break;
            case 1:
                jp9Var.h(exc);
                break;
            case 2:
                jp9Var.h(exc);
                break;
            default:
                jp9Var.h(exc);
                break;
        }
    }
}
