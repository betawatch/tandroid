// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tn3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ co3 b;

    public /* synthetic */ tn3(co3 co3Var, byte b) {
        this.a = b;
        this.b = co3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        co3 co3Var = this.b;
        switch (b) {
            case 0:
                co3Var.d(null);
                break;
            case 1:
                co3Var.g = true;
                co3Var.d(null);
                break;
            case 2:
                co3Var.d(null);
                break;
            default:
                co3Var.f(2, "I recorded it this morning on my way to the office.");
                break;
        }
    }
}
