// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zm0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dn0 b;

    public /* synthetic */ zm0(dn0 dn0Var, byte b) {
        this.a = b;
        this.b = dn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dn0 dn0Var = this.b;
        switch (b) {
            case 0:
                dn0Var.dismiss();
                break;
            default:
                dn0Var.onBackPressed();
                break;
        }
    }
}
