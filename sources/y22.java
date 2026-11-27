// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y22 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a32 b;

    public /* synthetic */ y22(a32 a32Var, byte b) {
        this.a = b;
        this.b = a32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a32 a32Var = this.b;
        switch (b) {
            case 0:
                if (a32Var.f != null) {
                    a32Var.w = xnb.k(new StringBuilder("+"), a32Var.f.phone, f78.f());
                    a32Var.s = a32Var.f;
                    hl.c3(new y22(a32Var, (byte) 1));
                    break;
                }
                break;
            default:
                a32Var.c.l(a32Var.w, false);
                break;
        }
    }
}
