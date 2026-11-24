// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ y6(r7 r7Var, int i, byte b) {
        this.a = b;
        this.b = r7Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        r7 r7Var = this.b;
        switch (b) {
            case 0:
                if (r7Var.b.getSwipeBack() != null) {
                    r7Var.b.getSwipeBack().e(i);
                    break;
                }
                break;
            default:
                if (r7Var.b.getSwipeBack() != null) {
                    r7Var.b.getSwipeBack().e(i);
                    break;
                }
                break;
        }
    }
}
