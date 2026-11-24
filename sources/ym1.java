// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ym1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ym1(yv1 yv1Var, long j, long j2, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.s9(j2, j);
                break;
            default:
                yv1Var.U9(j2, j);
                break;
        }
    }
}
