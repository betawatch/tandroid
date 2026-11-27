// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v07 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e17 b;

    public /* synthetic */ v07(e17 e17Var, byte b) {
        this.a = b;
        this.b = e17Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e17 e17Var = this.b;
        switch (b) {
            case 0:
                e17Var.e();
                break;
            case 1:
                e17.k(e17Var.q, true, true);
                break;
            default:
                e17Var.e();
                break;
        }
    }
}
