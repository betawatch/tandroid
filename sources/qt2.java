// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cu2 b;

    public /* synthetic */ qt2(cu2 cu2Var, byte b) {
        this.a = b;
        this.b = cu2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cu2 cu2Var = this.b;
        switch (b) {
            case 0:
                cu2Var.d0();
                break;
            case 1:
                if (cu2Var.K) {
                    cu2Var.d.d.requestFocus();
                    hl.E3(cu2Var.d.d);
                    break;
                }
                break;
            default:
                cu2Var.presentFragment(zu1.ha(cu2Var.I), true);
                break;
        }
    }
}
