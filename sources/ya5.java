// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ya5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ za5 b;

    public /* synthetic */ ya5(za5 za5Var, byte b) {
        this.a = b;
        this.b = za5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        za5 za5Var = this.b;
        switch (b) {
            case 0:
                int width = za5Var.getWidth();
                int height = za5Var.getHeight();
                if (za5Var.w && !za5Var.y && width > 0 && height > 0 && !za5Var.a.isEmpty() && za5Var.F > 0.0f && za5Var.b() && Math.abs(Math.log((width / height) / za5Var.F)) > 0.06d) {
                    za5Var.f(true);
                    break;
                }
                break;
            default:
                if (za5Var.y) {
                    za5Var.g();
                    za5Var.post(new ya5(za5Var, (byte) 0));
                    break;
                }
                break;
        }
    }
}
