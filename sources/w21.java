// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w21 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c21 b;

    public /* synthetic */ w21(c21 c21Var, byte b) {
        this.a = b;
        this.b = c21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        c21 c21Var = this.b;
        switch (b) {
            case 0:
                c21Var.performHapticFeedback(3, 2);
                break;
            default:
                c21Var.performHapticFeedback(3, 2);
                break;
        }
    }
}
