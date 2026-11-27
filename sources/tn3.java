// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tn3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ co3 b;

    public /* synthetic */ tn3(co3 co3Var, byte b) {
        this.a = b;
        this.b = co3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        co3 co3Var = this.b;
        switch (b) {
            case 0:
                co3Var.d(null);
                break;
            case 1:
                co3Var.g = true;
                co3Var.d(null);
                break;
            case 2:
                co3Var.d(null);
                break;
            default:
                co3Var.f(2, "I recorded it this morning on my way to the office.");
                break;
        }
    }
}
