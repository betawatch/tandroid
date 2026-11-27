// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
