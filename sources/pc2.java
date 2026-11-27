// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class pc2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vc2 b;

    public /* synthetic */ pc2(vc2 vc2Var, byte b) {
        this.a = b;
        this.b = vc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vc2 vc2Var = this.b;
        switch (b) {
            case 0:
                jn7.f(vc2Var.C.a).k(jn7.w2, Long.valueOf(vc2Var.c), Long.valueOf(vc2Var.b.id), Boolean.FALSE);
                break;
            case 1:
                vc2Var.E = false;
                vc2Var.d();
                jn7.f(vc2Var.C.a).k(jn7.C2, new Object[0]);
                break;
            case 2:
            default:
                vc2Var.e();
                break;
        }
    }
}
