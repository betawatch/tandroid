// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z6(s7 s7Var, int i, byte b) {
        this.a = b;
        this.b = s7Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        s7 s7Var = this.b;
        switch (b) {
            case 0:
                if (s7Var.b.getSwipeBack() != null) {
                    s7Var.b.getSwipeBack().e(i);
                    break;
                }
                break;
            default:
                if (s7Var.b.getSwipeBack() != null) {
                    s7Var.b.getSwipeBack().e(i);
                    break;
                }
                break;
        }
    }
}
