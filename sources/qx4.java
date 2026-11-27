// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qx4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sx4 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qx4(sx4 sx4Var, boolean z, byte b) {
        this.a = b;
        this.b = sx4Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        sx4 sx4Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    sx4Var.H.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!z) {
                    sx4Var.w.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
