// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class zp6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ zp6(ls6 ls6Var, boolean z, int i, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        boolean z = this.c;
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                ls6Var.r0[z ? 1 : 0] = i;
                break;
            default:
                ls6Var.x0[z ? 1 : 0] = false;
                ls6Var.y0[z ? 1 : 0] = true;
                ls6Var.r0[z ? 1 : 0] = i;
                break;
        }
    }
}
