// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class zx6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qy6 b;

    public /* synthetic */ zx6(qy6 qy6Var, byte b) {
        this.a = b;
        this.b = qy6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qy6 qy6Var = this.b;
        switch (b) {
            case 0:
                qy6Var.m0(new zx6(qy6Var, (byte) 1));
                break;
            default:
                qy6Var.p0();
                break;
        }
    }
}
