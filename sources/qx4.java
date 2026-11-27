// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qx4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sx4 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qx4(sx4 sx4Var, boolean z, byte b) {
        this.a = b;
        this.b = sx4Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        sx4 sx4Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    sx4Var.H.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!z) {
                    sx4Var.w.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
