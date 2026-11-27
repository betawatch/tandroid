// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bf7 b;

    public /* synthetic */ ue(bf7 bf7Var, byte b) {
        this.a = b;
        this.b = bf7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bf7 bf7Var = this.b;
        switch (b) {
            case 0:
                bf7Var.A(false);
                break;
            case 1:
                bf7Var.A(false);
                break;
            default:
                bf7Var.A(true);
                break;
        }
    }
}
