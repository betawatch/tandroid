// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pq8 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ zo9(pq8 pq8Var, Exception exc, byte b) {
        this.a = b;
        this.b = pq8Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        pq8 pq8Var = this.b;
        switch (b) {
            case 0:
                ((jp9) pq8Var.b).h(exc);
                break;
            default:
                jp9 jp9Var = (jp9) pq8Var.b;
                jp9Var.m.a("recording segment interrupted in state=".concat(uh9.A(jp9Var.a0)), exc);
                int i = jp9Var.a0;
                if (i != 3) {
                    if (i == 2) {
                        jp9Var.D = true;
                        break;
                    }
                } else {
                    jp9Var.q();
                    break;
                }
                break;
        }
    }
}
