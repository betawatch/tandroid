// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wp1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ byte b;
    public final /* synthetic */ yv1 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wp1(int i, yv1 yv1Var, boolean z) {
        this.b = i;
        this.c = yv1Var;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        yv1 yv1Var = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                yv1Var.gd(b2, z);
                break;
            default:
                if (b2 != 2) {
                    yv1Var.ja();
                    yv1Var.Dc();
                }
                yp2.f(c41.b0(yv1Var), b2, z);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wp1(yv1 yv1Var, boolean z, int i) {
        this.c = yv1Var;
        this.d = z;
        this.b = i;
    }
}
