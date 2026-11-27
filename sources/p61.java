// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
