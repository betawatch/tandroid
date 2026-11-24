// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class w27 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f37 b;

    public /* synthetic */ w27(f37 f37Var, byte b) {
        this.a = b;
        this.b = f37Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        f37 f37Var = this.b;
        switch (b) {
            case 0:
                boolean z = f37Var.d0.d.r;
                fu fuVar = f37Var.f;
                if (!z) {
                    fuVar.y0(fuVar.computeVerticalScrollRange() - (fuVar.computeVerticalScrollExtent() + fuVar.computeVerticalScrollOffset()), kk7.Y3, la2.V);
                    break;
                } else {
                    fuVar.y0(-fuVar.computeVerticalScrollOffset(), kk7.Y3, la2.V);
                    break;
                }
            default:
                f37Var.g(true, false);
                break;
        }
    }
}
