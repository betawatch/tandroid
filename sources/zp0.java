// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zp0 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zp0(long j, long j2, long j3, n82 n82Var) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = n82Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                bq0 bq0Var = (bq0) obj;
                long j = this.d;
                long j2 = this.b;
                long j3 = this.c;
                bq0Var.c(j2, j3, j, true);
                vye.c(bq0Var.currentAccount, j3);
                break;
            default:
                long j4 = this.b;
                long j5 = this.c;
                z61.l0 = Long.valueOf(j4 * j5);
                Long valueOf = Long.valueOf(this.d * j5);
                z61.m0 = valueOf;
                ((n82) obj).a(z61.l0, valueOf);
                break;
        }
    }

    public /* synthetic */ zp0(bq0 bq0Var, long j, long j2, long j3) {
        this.e = bq0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}
