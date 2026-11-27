// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z6(s7 s7Var, int i, byte b) {
        this.a = b;
        this.b = s7Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        s7 s7Var = this.b;
        switch (b) {
            case 0:
                if (s7Var.b.getSwipeBack() != null) {
                    s7Var.b.getSwipeBack().e(i);
                    break;
                }
                break;
            default:
                if (s7Var.b.getSwipeBack() != null) {
                    s7Var.b.getSwipeBack().e(i);
                    break;
                }
                break;
        }
    }
}
