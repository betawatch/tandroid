// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class wo7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ip7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ wo7(ip7 ip7Var, long j, long j2, byte b) {
        this.a = b;
        this.b = ip7Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        ip7 ip7Var = this.b;
        switch (b) {
            case 0:
                ip7Var.G = j2;
                ip7Var.H = j;
                break;
            default:
                ip7Var.i(j2, j);
                break;
        }
    }
}
