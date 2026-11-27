// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rn2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xn2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ rn2(xn2 xn2Var, long j, byte b) {
        this.a = b;
        this.b = xn2Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        xn2 xn2Var = this.b;
        switch (b) {
            case 0:
                xn2Var.Z(j);
                break;
            default:
                xn2Var.presentFragment(zu1.ha(j));
                break;
        }
    }
}
