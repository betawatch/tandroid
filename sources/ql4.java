// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ql4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xl4 b;

    public /* synthetic */ ql4(xl4 xl4Var, byte b) {
        this.a = b;
        this.b = xl4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xl4 xl4Var = this.b;
        switch (b) {
            case 0:
                xl4Var.t();
                if (xl4Var.b.i()) {
                    hl.d3(this, 500L);
                    break;
                }
                break;
            default:
                if (!xl4Var.b.H()) {
                    xl4Var.x = false;
                    xl4Var.q(false);
                    xl4Var.z = false;
                    break;
                } else {
                    hl.d3(this, 1500L);
                    break;
                }
        }
    }
}
