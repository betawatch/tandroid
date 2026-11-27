// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xg6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zj3 b;

    public /* synthetic */ xg6(zj3 zj3Var, byte b) {
        this.a = b;
        this.b = zj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zj3 zj3Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new xg6(zj3Var, (byte) 1));
                break;
            default:
                zj3Var.a("CANCELLED");
                break;
        }
    }
}
