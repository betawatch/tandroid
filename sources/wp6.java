// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class wp6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hs6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ wp6(hs6 hs6Var, long j, long j2, int[] iArr, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = j;
        this.d = j2;
        this.e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int[] iArr = this.e;
        long j = this.d;
        long j2 = this.c;
        hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                hs6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                break;
            case 1:
                hs6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                break;
            default:
                hs6Var.getNotificationCenter().k(35, Long.valueOf(j2), Long.valueOf(j), iArr);
                break;
        }
    }
}
