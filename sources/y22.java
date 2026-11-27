// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y22 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a32 b;

    public /* synthetic */ y22(a32 a32Var, byte b) {
        this.a = b;
        this.b = a32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a32 a32Var = this.b;
        switch (b) {
            case 0:
                if (a32Var.f != null) {
                    a32Var.w = xnb.k(new StringBuilder("+"), a32Var.f.phone, f78.f());
                    a32Var.s = a32Var.f;
                    hl.c3(new y22(a32Var, (byte) 1));
                    break;
                }
                break;
            default:
                a32Var.c.l(a32Var.w, false);
                break;
        }
    }
}
