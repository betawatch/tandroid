// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p61 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ tt c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ q61 e;

    public /* synthetic */ p61(boolean[] zArr, tt ttVar, long[] jArr, q61 q61Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = ttVar;
        this.d = jArr;
        this.e = q61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hl.c3(new p61(this.b, this.c, this.d, this.e, (byte) 1));
                break;
            default:
                this.b[0] = true;
                this.c.e(1.0f);
                long[] jArr = this.d;
                long j = jArr[0];
                q61 q61Var = this.e;
                if (j <= 0) {
                    q61Var.dismiss();
                    break;
                } else {
                    hl.d3(new fv0(q61Var, (byte) 13), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
