// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
